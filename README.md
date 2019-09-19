# scalable-api-testing

With this POC using maven, JUnit5, rest-assured and spotify-docker-plugin you should be able to:<br>
- Create and deploy a docker image to docker-daemon running mvn clean install, and run your tests suite.<br>

From running perspective you will achiev:<br>
- Each suite sequentially at the container level with Docker.<br>
- Each test class in parallel at suite level with JUnit 5
