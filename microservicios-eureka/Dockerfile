FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8761

WORKDIR /app
COPY ./target/microservicios-eureka.jar .

ENTRYPOINT ["java","-jar","/app/microservicios-eureka.jar"]