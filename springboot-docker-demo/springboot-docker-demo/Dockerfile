FROM openjdk:11
LABEL maintainer="Lova Chittumuri"
ADD target/boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]