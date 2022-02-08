FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} practicedocker.jar
ENTRYPOINT ["java","-jar","/practicedocker.jar"]