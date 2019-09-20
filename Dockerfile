FROM openjdk:10-jre-slim

WORKDIR /usr/share/tag

ADD target/scalable-api-testing-1.0-SNAPSHOT.jar scalable-api-testing-1.0-SNAPSHOT.jar

ENTRYPOINT java -jar scalable-api-testing-1.0-SNAPSHOT.jar $SUITE