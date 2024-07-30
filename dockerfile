FROM openjdk:17-alpine
COPY target/*.jar /demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]