FROM eclipse-temurin:17
LABEL maintainer="felix@java10x.dev"
WORKDIR /dockerapp
COPY target/DockerWorkshopJava10x-0.0.1-SNAPSHOT.jar /dockerapp/docker-workshop.jar
ENTRYPOINT ["java", "-jar", "docker-workshop.jar"]