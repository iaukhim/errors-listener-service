FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
WORKDIR ./app
ARG JAR_FILE=./target/errors-listener-service-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]