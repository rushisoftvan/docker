# Use an official Java runtime as a parent image
FROM 21.0.5_11-jdk AS build

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY  target/docker-0.0.1-SNAPSHOT.jar   /app/app.jar

 # Expose the port your application runs on (e.g., 8080)
 EXPOSE 9090


# Run the Java program
ENTRYPOINT ["java", "-jar", "/app/app.jar"]