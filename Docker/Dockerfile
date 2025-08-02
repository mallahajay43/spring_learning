From eclipse-temurin:21 AS build
WORKDIR /app

COPY . .
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8000
# Set the entry point to run the application

ENTRYPOINT ["java", "-jar", "app.jar"]
# Dockerfile for a Java application using Maven
# This Dockerfile builds a Java application using Maven and runs it in a JRE environment.   