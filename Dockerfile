FROM openjdk:11
EXPOSE 8080
ADD target/SpringSchedule-0.0.1-SNAPSHOT.jar SpringSchedule-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringSchedule-0.0.1-SNAPSHOT.jar"]