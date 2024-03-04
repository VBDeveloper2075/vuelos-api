package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    private List<Vuelo> vuelos = new ArrayList<>();

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

    //en localhost:8080/adios => veo el mensaje "Adios Mundo"
    @GetMapping("/adios")
    public String adios() {
        return "Adios Mundo";
    }

    @GetMapping("/vuelo")
    public String mostrarVuelo() {
        Vuelo vuelo = new Vuelo(1L, "Buenos Aires", "Roma", LocalDateTime.now(), LocalDateTime.now().plusHours(13), 1000.0, "Diario");
        return "Vuelo: " + "\nID: " + vuelo.getId() + "\nOrigen: " + vuelo.getOrigen() + "\nDestino: " + vuelo.getDestino() + "\nFecha y hora de salida: " + vuelo.getFechaHoraSalida() + "\nFecha y hora de llegada: " + vuelo.getFechaHoraLlegada() + "\nPrecio: " + vuelo.getPrecioEnPesos() + "\nFrecuencia: " + vuelo.getFrecuencia();
    }

    @PostMapping("/crear")
    public Vuelo crearVuelo(@RequestBody Vuelo nuevoVuelo) {
        vuelos.add(nuevoVuelo);
        return nuevoVuelo;
    }

    @PutMapping("/actualizar/{id}")
    public Vuelo actualizarVuelo(@PathVariable Long id, @RequestBody Vuelo vueloActualizado) {
        for (int i = 0; i < vuelos.size(); i++) {  //metodo para obtener el largo de una coleccion
            if (vuelos.get(i).getId().equals(id)) {
                vuelos.set(i, vueloActualizado);
                return vueloActualizado;
            }
        }
        return null;
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarVuelo(@PathVariable Long id) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelos.get(i).getId().equals(id)) {
                vuelos.remove(i);
                return "Vuelo con id " + id + " borrado";
            }
        }
        // mensaje si no se encontró el vuelo
        return "Vuelo con id " + id + " no encontrado";
    }
}





