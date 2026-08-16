FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml .
COPY service-registry/pom.xml service-registry/pom.xml
COPY service-provider/pom.xml service-provider/pom.xml
COPY service-consumer/pom.xml service-consumer/pom.xml
COPY service-registry/src service-registry/src
COPY service-provider/src service-provider/src
COPY service-consumer/src service-consumer/src
RUN mvn -pl service-provider -am package -DskipTests
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /workspace/service-provider/target/service-provider-*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
