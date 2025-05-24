# Imagen base con Java + Alpine
FROM eclipse-temurin:21-jdk-alpine

LABEL authors="Fabián Flórez"

# Establece el directorio de trabajo
WORKDIR /app

# Copia el proyecto entero (incluye pom.xml, src, mvnw, etc.)
COPY . .

# Da permisos al wrapper de Maven (por si hace falta)
RUN chmod +x mvnw

# Compila el proyecto y genera el .jar
RUN ./mvnw clean package -DskipTests

# Expone el puerto de la app
EXPOSE 8080

# Ejecuta el .jar compilado
CMD ["java", "-jar", "target/AkihabaraMarket-0.0.1-SNAPSHOT.jar"]

