package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import codoacodo.vuelosapi.service.VueloService;
import java.util.List;

@RestController
@RequestMapping("/api/flights")
// @RequestMapping trae el metodo listarVuelos() del controlador, que a su vez se conecta con el servicio, que a su
// vez llama al repositorio, que se conecta con la base de datos.

public class VueloController {

    @Autowired
    private VueloService vueloService;

    @PostMapping("/add")
public ResponseEntity<Vuelo> crearVuelo(@RequestBody Vuelo vuelo) {
    Vuelo nuevoVuelo = vueloService.crearVuelo(vuelo);
    return new ResponseEntity<>(nuevoVuelo, HttpStatus.CREATED);
}

//    este metodo devuelve una lista de vuelos
    @GetMapping("")
    public List<Vuelo> listarVuelos() {
        return (List<Vuelo>) vueloService.listarVuelos();
    }

    @GetMapping("/{id}")
    public Vuelo obtenerVueloPorId(@PathVariable Long id) {
        return vueloService.devolverVuelo(id);
    }

    @PatchMapping("/correct/{id}")
    public Vuelo actualizarVuelo(@PathVariable Long id, @RequestBody Vuelo vuelo) {
        vuelo.setId(id);
        return vueloService.actualizarVuelo(vuelo);
    }

    @DeleteMapping("/erase/{id}")
    public ResponseEntity<?> borrarVuelo(@PathVariable Long id) {
        vueloService.borrarVuelo(id);
        return ResponseEntity.ok().build();
    }

    public void setVueloService(VueloService vueloService) {
        this.vueloService = vueloService;
    }
}