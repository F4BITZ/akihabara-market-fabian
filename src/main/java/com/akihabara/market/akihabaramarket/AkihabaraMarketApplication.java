package com.akihabara.market.akihabaramarket;

import com.akihabara.market.akihabaramarket.model.ProductoOtaku;
import com.akihabara.market.akihabaramarket.repository.ProductoOtakuRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// Anotación que combina @Configuration, @EnableAutoConfiguration y @ComponentScan
// Marca esta clase como el punto de entrada de la aplicación Spring Boot
public class AkihabaraMarketApplication {

    public static void main(String[] args) {
        // Lanza la aplicación Spring Boot
        SpringApplication.run(AkihabaraMarketApplication.class, args);
    }

    @Bean
    // Crea un bean de tipo CommandLineRunner que se ejecuta justo después de iniciar la app
    public CommandLineRunner initData(ProductoOtakuRepository repo) {
        return args -> {
            // Inserta 3 productos en la base de datos al iniciar la app (base de datos H2 en memoria)
            repo.save(new ProductoOtaku(null, "Figura de Luffy", "Figura", 29.99, 10));
            repo.save(new ProductoOtaku(null, "Manga de Naruto", "Manga", 7.99, 50));
            repo.save(new ProductoOtaku(null, "Póster de One Piece", "Póster", 4.99, 20));
        };
    }
}
