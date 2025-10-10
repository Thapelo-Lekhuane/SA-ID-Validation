# PowerShell script to run the SA ID Validator in Docker
Write-Host "Starting SA ID Validator Docker Container..."
Write-Host ""
Write-Host "Prerequisites:"
Write-Host "1. VcXsrv X Server must be installed and running"
Write-Host "2. In VcXsrv, make sure 'Disable access control' is checked"
Write-Host ""

$continue = Read-Host "Press Enter to continue or 'q' to quit"
if ($continue -eq 'q') { exit }

Write-Host "Building Docker image..."
docker build -t sa-id-validator-desktop .

if ($LASTEXITCODE -eq 0) {
    Write-Host "Build successful! Starting container..."
    
    # Check if running in WSL2
    if (wsl --status) {
        Write-Host "Switching to WSL2 to run the container..."
        wsl bash -c "cd /mnt/c/Users/User/Desktop/SA-ID-Validation && chmod +x scripts/run-windows.sh && ./scripts/run-windows.sh"
    } else {
        Write-Host "Please run this in WSL2 for proper X11 forwarding"
    }
} else {
    Write-Host "Build failed! Check the error messages above."
}
