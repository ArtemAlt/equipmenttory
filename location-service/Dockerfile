FROM openjdk:17-jdk-slim
ADD . /src
WORKDIR /src
RUN chmod +x ./mvnw
RUN ./mvnw package -DskipTests
EXPOSE 8199
EXPOSE 8190
EXPOSE 8191
ENTRYPOINT ["java","-jar","target/location-service-0.0.1-SNAPSHOT.jar"]