#!/bin/bash

# Exit immediately if a command exits with a non-zero status
set -e

git pull

# Define variables
DOCKER_IMAGE_NAME="your-docker-image-name"  # Replace with your desired Docker image name

# Build the Maven project
echo "Building the Maven project..."
./mvnw clean package

docker-compose up --build


