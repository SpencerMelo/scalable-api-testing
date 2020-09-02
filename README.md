# scalable-api-testing

With this POC using maven, JUnit5, rest-assured and spotify-docker-plugin you should be able to:<br>
- Build and deploy an image to docker-daemon running mvn clean install.
- Run your tests suite using docker-compose.<br>

From running perspective you will achieve:<br>
- Each suite STARTING sequentially at the container level with Docker.<br>
- Each test class in parallel at suite level with JUnit 5.

How to use:
- Run "mvn clean install"
- Run "docker-compose up"

Assumptions:
- You have docker installed in your machine.
- You have docker-compose installed in your machine.
- You have maven installed in your machine.