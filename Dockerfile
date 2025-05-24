# Usa una imagen base de Java (compatible con tu versión de JDK, en tu caso JDK 20 o 21)
FROM eclipse-temurin:21-jdk-alpine

# Autor (opcional)
LABEL authors="Fabián Flórez"

# Directorio dentro del contenedor
WORKDIR /app

# Copia el archivo .jar al contenedor (ajusta el nombre según tu build)
COPY target/AkihabaraMarket-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto 8080
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
