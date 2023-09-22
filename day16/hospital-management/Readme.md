##Build Application
    mvn clean install

###Run Application
  docker-compose -f docker-compose-mongo.yml up -d
  mvn spring-boot:run

###Create docker image
    mvn install dockerfile:build

###Run Docker Container
    docker-compose up -d