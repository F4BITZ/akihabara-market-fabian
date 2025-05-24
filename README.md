# 🛍️ Akihabara Market API

Microservicio REST desarrollado con **Spring Boot** para gestionar el inventario de una tienda otaku. Esta API permite realizar operaciones CRUD sobre productos como figuras, mangas y pósters.

---

## 🌍 API desplegada en Render

🔗 **Base URL**:  
https://akihabara-market-fabian.onrender.com/productos

🔎 **Swagger UI (documentación interactiva)**:  
https://akihabara-market-fabian.onrender.com/swagger-ui.html

🧪 **Consola de base de datos H2**:  
https://akihabara-market-fabian.onrender.com/h2-console  
(**JDBC URL**: `jdbc:h2:mem:otaku`)

---

## 🚀 Tecnologías utilizadas

- Java 20
- Spring Boot 3.4.5
- Spring Data JPA
- Hibernate Validator
- H2 (base de datos en memoria)
- Swagger (OpenAPI 3)
- Maven
- Render.com (despliegue cloud)

---

## 🔧 Endpoints principales

| Método | Endpoint             | Descripción                     |
|--------|----------------------|---------------------------------|
| GET    | `/productos`         | Listar todos los productos      |
| GET    | `/productos/{id}`    | Obtener producto por ID         |
| POST   | `/productos`         | Crear un nuevo producto         |
| PUT    | `/productos/{id}`    | Actualizar un producto existente |
| DELETE | `/productos/{id}`    | Eliminar un producto por ID     |

---

## 📦 Ejemplo de producto (JSON)

```json
{
  "nombre": "Figura de Goku",
  "categoria": "Figura",
  "precio": 39.99,
  "stock": 5
}
