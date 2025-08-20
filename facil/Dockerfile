FROM gradle:8.10.1-jdk17 AS build
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src
RUN gradle clean build
RUN ls -l /app/build/libs/  

FROM eclipse-temurin:17-jdk
WORKDIR /app  
COPY --from=build /app/build/libs/cadastro-0.0.1-SNAPSHOT.jar /app/app.jar 
EXPOSE 8080
ENTRYPOINT java -jar /app/app.jar