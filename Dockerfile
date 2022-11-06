FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/simple-one-endpoint-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "simple-one-endpoint-1.0-SNAPSHOT.jar"]
