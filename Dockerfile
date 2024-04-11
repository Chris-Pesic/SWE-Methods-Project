FROM openjdk:latest
COPY ./target/GroupProject14-0.1.0.1.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "GroupProject14.jar", "db:3306", "10000"]