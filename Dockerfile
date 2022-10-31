FROM openjdk:17
ADD target/demo-app-0.0.1-SNAPSHOT.jar demo-app-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","demo-app-0.0.1-SNAPSHOT.jar"]