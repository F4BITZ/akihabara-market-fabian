package com.akihabara.market.akihabaramarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("api", "Akihabara Market");
        respuesta.put("estado", "activo");
        respuesta.put("documentacion", "/swagger-ui.html");
        return respuesta;
    }
}
