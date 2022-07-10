# instrukcja parametry_dla_instrukcji

# For Java 11, use this
FROM openjdk:11

# For Java 8
# FROM openjdk:8-jdk-alpine

# Changed the working directory to /opt/app
WORKDIR /opt/app

ARG JAR_FILE=target/HelloWorldAPI-0.0.2-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]