#!/bin/bash
# For Windows with WSL2 and VcXsrv
# Start VcXsrv first, then run this script in WSL2

# Get Windows host IP
WINDOWS_IP=$(cat /etc/resolv.conf | grep nameserver | awk '{print $2}')

echo "Starting SA ID Validator..."
echo "Make sure VcXsrv is running with 'Disable access control' checked"

# Run the container
docker run -it --rm \
    --name sa-id-validator \
    -e DISPLAY=$WINDOWS_IP:0.0 \
    sa-id-validator-desktop
