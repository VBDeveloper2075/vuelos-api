package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import codoacodo.vuelosapi.service.VueloService;
import java.util.List;

@RestController
@RequestMapping("/api/vuelos")
// @RequestMapping trae el metodo listarVuelos() del controlador, que a su vez se conecta con el servicio, que a su
// vez llama al repositorio, que se conecta con la base de datos.
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @PostMapping
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        System.out.println("VueloController.crearVuelo");
        return vueloService.crearVuelo(vuelo);
    }

//    este metodo devuelve una lista de vuelos
    @GetMapping
    public List<Vuelo> listarVuelos() {
        return (List<Vuelo>) vueloService.listarVuelos();
    }

    @GetMapping("/{id}")
    public Vuelo obtenerVueloPorId(@PathVariable Long id) {
        return vueloService.devolverVuelo(id);
    }

    @PatchMapping("/{id}")
    public Vuelo actualizarVuelo(@PathVariable Long id, @RequestBody Vuelo vuelo) {
        vuelo.setId(id);
        return vueloService.actualizarVuelo(vuelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarVuelo(@PathVariable Long id) {
        vueloService.borrarVuelo(id);
        return ResponseEntity.ok().build();
    }
}