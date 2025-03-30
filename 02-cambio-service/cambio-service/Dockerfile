FROM openjdk:21-jdk-slim

# Definir variável ARG para o JAR
ARG JAR_FILE=02-cambio-service/cambio-service/target/*.jar

# Copiar o JAR para o container
COPY ${JAR_FILE} app.jar

ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]
