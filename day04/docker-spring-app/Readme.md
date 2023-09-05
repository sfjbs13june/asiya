## Simple Detail Application

### Application Build Successfully
    mvn clean install

### Run Application Successfully
    mvn spring-boot:run

### Created docker image

    mvn install dockerfile:build

## Docker Image Run Successfully
    docker run -p 8081:8081 asiya003/docker-spring-app:1.0.0 