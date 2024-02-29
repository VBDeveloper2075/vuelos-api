package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    Vuelo vuelo1 = new Vuelo(1L, "Buenos Aires", "Madrid", "2021-10-10T10:00:00", "2021-10-10T20:00:00", 100000, "diario");
    Vuelo vuelo2 = new Vuelo(2L, "Buenos Aires", "Miami", "2021-10-10T10:00:00", "2021-10-10T20:00:00", 120000, "diario");
    Vuelo vuelo3 = new Vuelo(3L, "Buenos Aires", "Roma", "2021-10-10T10:00:00", "2021-10-10T20:00:00", 110000, "diario");
    Vuelo vuelo4 = new Vuelo(4L, "Buenos Aires", "Nueva York", "2021-10-10T10:00:00", "2021-10-10T20:00:00", 130000, "diario");
    Vuelo vuelo5 = new Vuelo(5L, "Buenos Aires", "Londres", "2021-10-10T10:00:00", "2021-10-10T20:00:00", 140000, "diario");

    @GetMapping("/")
    public String hola() {
        return "<h1> Hola Mundo </h1>";
    }

    @GetMapping("/listar")
    public Vuelo[] listarVuelos() {
        Vuelo[] vuelos = {vuelo1, vuelo2, vuelo3, vuelo4, vuelo5};
        return vuelos;
    }
}
