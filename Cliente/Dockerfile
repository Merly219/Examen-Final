# Usa una imagen base de Java (ajusta según tu versión de Java)
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR generado por Maven al contenedor
COPY Cliente-0.0.1-SNAPSHOT.jar cliente.jar

# Expone el puerto en el que corre el microservicio
EXPOSE 9007

# Comando de inicio del microservicio
ENTRYPOINT ["java", "-jar", "cliente.jar"]
