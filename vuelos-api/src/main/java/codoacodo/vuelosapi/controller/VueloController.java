package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import codoacodo.vuelosapi.service.VueloService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vuelos")
// @RequestMapping trae el metodo listarVuelos() del controlador, que a su vez se conecta con el servicio, que a su
// vez llama al repositorio, que se conecta con la base de datos.
public class VueloController {

    @Autowired
    private VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

    @PostMapping("/agregar")
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        vueloService.crearVuelo(vuelo);
        return vuelo;
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

    @PatchMapping("/{id}")
    public Vuelo actualizarVuelo(@PathVariable Long id, @RequestBody Vuelo vuelo) {
        vuelo.setId(id);
        return vueloService.actualizarVuelo(vuelo);
    }

    @PutMapping("/update")
    public Optional<Vuelo> updateVuelo(@RequestBody Vuelo vuelo) {
        return vueloService.update(vuelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarVuelo(@PathVariable Long id) {
        vueloService.borrarVuelo(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/locations")
    public List<Vuelo> getVueloByLocation(@RequestParam String origen, @RequestParam String destino) {
        return vueloService.getByOrigenyDestino(origen, destino);
    }

    @GetMapping("/ofertas")
    public List<Vuelo> getOfertas() {
        Integer ofertas = 1000;
        return vueloService.getOfertas(ofertas);
    }

    @GetMapping("/precio-dolar")
    public double getDolar() {
        return vueloService.getDolar();
    }

}