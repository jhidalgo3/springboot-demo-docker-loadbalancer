FROM openjdk:8-jre-alpine

EXPOSE 8080

WORKDIR /demo-docker
ADD ./target/demo-docker-lb-0.1.0.jar /demo-docker/demo-docker-lb-0.1.0.jar

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar demo-docker-lb-0.1.0.jar" ]
