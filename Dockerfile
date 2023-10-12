FROM openjdk:17-jdk-alpine
VOLUME /tmp

COPY target/container-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar app.jar --spring.config.location=classpath:/application.properties