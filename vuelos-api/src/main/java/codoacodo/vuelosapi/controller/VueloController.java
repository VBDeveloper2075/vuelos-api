package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

//    no funcionaba porque la fecha estaba en formato string, entronces lo parseo a formato LocalDateTime
    Vuelo vuelo1 = new Vuelo(1L, "Buenos Aires", "Madrid", LocalDateTime.parse("2021-10-10T10:00:00", formatter), LocalDateTime.parse("2021-10-10T20:00:00", formatter), 100000, "diario");
    Vuelo vuelo2 = new Vuelo(2L, "Buenos Aires", "Miami", LocalDateTime.parse("2021-10-10T10:00:00", formatter), LocalDateTime.parse("2021-10-10T20:00:00", formatter), 120000, "diario");
    Vuelo vuelo3 = new Vuelo(3L, "Buenos Aires", "Roma", LocalDateTime.parse("2021-10-10T10:00:00", formatter), LocalDateTime.parse("2021-10-10T20:00:00", formatter), 110000, "diario");
    Vuelo vuelo4 = new Vuelo(4L, "Buenos Aires", "Nueva York", LocalDateTime.parse("2021-10-10T10:00:00", formatter), LocalDateTime.parse("2021-10-10T20:00:00", formatter), 130000, "diario");
    Vuelo vuelo5 = new Vuelo(5L, "Buenos Aires", "Londres", LocalDateTime.parse("2021-10-10T10:00:00", formatter), LocalDateTime.parse("2021-10-10T20:00:00", formatter), 140000, "diario");

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