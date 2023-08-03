FROM openjdk:11 as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Docker-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Docker-demo-0.0.1-SNAPSHOT.jar"]