FROM openjdk:10-jre-slim

# Creating the folder structure used.
RUN mkdir -p app/report

# Where it will run.
WORKDIR /app

# Getting the jar resultant of the install to the WORKDIR.
COPY target/scalable-api-testing-1.0-SNAPSHOT.jar scalable-api-testing-1.0-SNAPSHOT.jar

ENTRYPOINT java -jar scalable-api-testing-1.0-SNAPSHOT.jar $SUITE