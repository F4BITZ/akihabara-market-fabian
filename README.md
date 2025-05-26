# 🛍️ Akihabara Market API

Microservicio REST desarrollado con Spring Boot para gestionar el inventario de una tienda otaku.  
Esta API permite realizar operaciones CRUD sobre productos como figuras, mangas y pósters.

---

## 🌍 API desplegada en Render

- 🔗 **Base URL:**  
  https://akihabara-market-fabian.onrender.com/productos

- 🔎 **Swagger UI (documentación interactiva):**  
  https://akihabara-market-fabian.onrender.com/swagger-ui.html

- 🧪 **Consola de base de datos H2:**  
  https://akihabara-market-fabian.onrender.com/h2-console  
  (JDBC URL: `jdbc:h2:mem:otaku`)

> ⚠️ **Aviso:**  
> Render puede tardar unos segundos en iniciar el servicio si ha estado inactivo.  
> Si al abrir el enlace aparece un error (como 502 o pantalla negra), espere unos segundos y actualice la página.

---

## 🚀 Tecnologías utilizadas

- **Java 20**: Lenguaje principal utilizado para el desarrollo del backend.
- **Spring Boot 3.4.5**: Framework que simplifica la creación de aplicaciones web modernas.
- **Spring Data JPA**: Permite acceder a la base de datos sin necesidad de escribir consultas SQL.
- **Hibernate Validator**: Realiza validaciones automáticas de los datos (por ejemplo, evita precios negativos).
- **H2 Database**: Base de datos en memoria, ligera y rápida para pruebas y desarrollo.
- **Swagger (OpenAPI 3)**: Genera documentación interactiva de la API.
- **Maven**: Sistema de gestión de dependencias y construcción del proyecto.
- **Render.com**: Plataforma de despliegue que permite acceder a la API desde Internet.

---

## 🔧 Endpoints principales

| Método | Endpoint           | Descripción                         |
|--------|--------------------|-------------------------------------|
| GET    | /productos         | Listar todos los productos          |
| GET    | /productos/{id}    | Obtener un producto por ID          |
| POST   | /productos         | Crear un nuevo producto             |
| PUT    | /productos/{id}    | Actualizar un producto existente    |
| DELETE | /productos/{id}    | Eliminar un producto por ID         |

---

## 📦 Ejemplo de producto (JSON)

```json
{
  "nombre": "Figura de Goku",
  "categoria": "Figura",
  "precio": 39.99,
  "stock": 5
}
