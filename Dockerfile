FROM openjdk:11-jre-slim

# Install GUI dependencies
RUN apt-get update && apt-get install -y \
    libxtst6 \
    libxrender1 \
    libxi6 \
    libxrandr2 \
    libxcursor1 \
    libfontconfig1 \
    libxss1 \
    libgconf-2-4 \
    libxcomposite1 \
    libasound2 \
    && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy the app source files
COPY app/src/ ./app/src/

# Compile Java application
RUN javac -d classes app/src/main/java/org/example/*.java

# Set environment for GUI
ENV DISPLAY=:0

# Run the application
CMD ["java", "-cp", "classes", "org.example.SAIDValidatorGUI"]
