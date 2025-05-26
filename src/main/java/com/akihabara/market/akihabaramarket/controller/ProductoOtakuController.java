package com.akihabara.market.akihabaramarket.controller;

import com.akihabara.market.akihabaramarket.model.ProductoOtaku;
import com.akihabara.market.akihabaramarket.repository.ProductoOtakuRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://f4bitz.github.io")
@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/productos") // Ruta base para todos los endpoints: /productos
public class ProductoOtakuController {

    @Autowired // Inyección automática del repositorio
    private ProductoOtakuRepository repo;

    @GetMapping // Maneja solicitudes GET a /productos
    public List<ProductoOtaku> getAll() {
        return repo.findAll(); // Devuelve todos los productos
    }

    @GetMapping("/{id}") // Maneja solicitudes GET a /productos/{id}
    public ProductoOtaku getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null); // Busca por ID o devuelve null si no existe
    }

    @PostMapping // Maneja solicitudes POST a /productos
    public ProductoOtaku createProducto(@Valid @RequestBody ProductoOtaku producto) {
        producto.setId(null); // Se asegura de que el producto sea nuevo (no sobrescribe)
        return repo.save(producto); // Guarda el producto y lo devuelve
    }

    @PutMapping("/{id}") // Maneja solicitudes PUT a /productos/{id}
    public ResponseEntity<ProductoOtaku> update(@PathVariable Long id, @Valid @RequestBody ProductoOtaku producto) {
        return repo.findById(id)
                .map(existing -> {
                    producto.setId(id); // Asegura que se actualice el producto con el ID correcto
                    ProductoOtaku actualizado = repo.save(producto); // Guarda y devuelve el actualizado
                    return ResponseEntity.ok(actualizado); // Devuelve 200 OK
                })
                .orElseGet(() -> ResponseEntity.notFound().build()); // Si no se encuentra, devuelve 404
    }

    @DeleteMapping("/{id}") // Maneja solicitudes DELETE a /productos/{id}
    public void delete(@PathVariable Long id){
        repo.deleteById(id); // Elimina el producto si existe
    }

    @GetMapping("/")
    public String home() {
        return "✅ Akihabara Market API en funcionamiento. Visita /swagger-ui.html para la documentación.";
    }
}
