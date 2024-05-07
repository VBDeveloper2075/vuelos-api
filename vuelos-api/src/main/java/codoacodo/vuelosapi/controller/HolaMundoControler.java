package codoacodo.vuelosapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HolaMundoControler {
    @GetMapping("/hola/{nombreUsuario}")
    public String holaMundo(@PathVariable String nombreUsuario) {
        System.out.println("Ejecutando el método holaMundo()");
        return "Hola Mundo Spring Boot!. Bienvenido/a " + nombreUsuario + " a la API de Vuelos";
    }
}
