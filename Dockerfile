FROM openjdk
EXPOSE 4444
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT [ "java","-jar","/spring-boot-docker.jar" ]