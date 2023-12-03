FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8090

WORKDIR /app

COPY ./target/microservicios-zuul-0.0.1.jar .

ENTRYPOINT ["java","-jar","/app/microservicios-zuul-0.0.1.jar"]