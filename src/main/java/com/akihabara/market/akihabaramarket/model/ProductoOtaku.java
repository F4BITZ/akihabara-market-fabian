package com.akihabara.market.akihabaramarket.model;

// Anotaciones para documentar y validar el modelo
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*; // Anotaciones JPA
import lombok.*; // Anotaciones de Lombok
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Min;

@Entity // Marca esta clase como una entidad de base de datos (JPA)
@Data // Lombok: genera automáticamente getters, setters, toString, equals y hashCode
@NoArgsConstructor // Lombok: constructor sin argumentos (necesario para JPA)
@AllArgsConstructor // Lombok: constructor con todos los argumentos
public class ProductoOtaku {

    // Documentación Swagger: describe el campo 'id' como generado automáticamente y de solo lectura
    @Schema(description = "ID generado automáticamente", accessMode = Schema.AccessMode.READ_ONLY)

    // Indica que este campo no debe ser incluido en el JSON de entrada, solo de salida
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)

    @Id // Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Valor autogenerado por la base de datos (autoincremental)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio") // Validación: el nombre no puede ser nulo ni estar vacío
    private String nombre;

    @NotBlank(message = "La categoría es obligatoria") // Validación: la categoría no puede estar vacía
    private String categoria;

    @Positive(message = "El precio debe ser positivo") // Validación: el precio debe ser mayor que 0
    private Double precio;

    @Min(value = 0, message = "El stock no puede ser negativo") // Validación: el stock debe ser 0 o más
    private Integer stock;
}
