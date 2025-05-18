FROM maven:3.9.6-eclipse-temurin-22-jammy as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:22-jdk
COPY --from=build /target/spring-application-0.0.1-SNAPSHOT.jar spring-application.jar
EXPOSE 2255
ENTRYPOINT ["java", "-jar", "spring-application.jar"]

