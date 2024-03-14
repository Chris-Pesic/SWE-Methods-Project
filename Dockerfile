FROM openjdk:latest
COPY ./target/GroupProject14-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "GroupProject14-0.1.0.1-jar-with-dependencies.jar"]