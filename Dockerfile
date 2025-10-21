# Use lightweight JDK for local development
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy built JAR from target folder
COPY target/person-0.0.1-SNAPSHOT.jar app.jar

# Expose port for local testing
EXPOSE 8081

# Run the app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
