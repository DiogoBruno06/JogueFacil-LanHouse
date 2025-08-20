# Etapa de build
FROM gradle:8.10.1-jdk17 AS build
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src
RUN gradle clean build

# Etapa de execução (Java 17)
FROM eclipse-temurin:17-jdk
WORKDIR /
COPY --from=build /app/build/libs/lanhouse-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081  
ENTRYPOINT ["java", "-jar", "/app.jar"]