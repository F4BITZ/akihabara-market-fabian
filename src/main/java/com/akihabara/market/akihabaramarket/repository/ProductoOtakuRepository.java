package com.akihabara.market.akihabaramarket.repository;

// Importa la clase ProductoOtaku (nuestra entidad)
import com.akihabara.market.akihabaramarket.model.ProductoOtaku;

// Importa JpaRepository, que da operaciones CRUD sin escribir SQL
import org.springframework.data.jpa.repository.JpaRepository;

// Esta interfaz es el repositorio que maneja la persistencia de ProductoOtaku
public interface ProductoOtakuRepository extends JpaRepository<ProductoOtaku, Long> {
    // Al extender JpaRepository ya están disponibles todos los métodos CRUD:
    // - List<ProductoOtaku> findAll();
    // - Optional<ProductoOtaku> findById(Long id);
    // - ProductoOtaku save(ProductoOtaku producto);
    // - void deleteById(Long id);

    // Si se necesita métodos personalizados, se puede agregar aquí.
    // Ejemplo:
    // List<ProductoOtaku> findByCategoria(String categoria);
}

