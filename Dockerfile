
# Use an official OpenJDK runtime as a parent image
# FROM eclipse-temurin
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /target


# Copy the JAR file from your host to the container
COPY target/merc-springboot-demo-0.0.1-SNAPSHOT.jar merc-springboot-demo.jar

# Run the application when the container starts
CMD ["java", "-jar", "merc-springboot-demo.jar"]


