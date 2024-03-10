package codoacodo.vuelosapi;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vuelos")
public class VueloController {

    @Autowired
    private service vueloService;

    @PostMapping
    public Vuelo crearVuelo(@RequestBody Vuelo vuelo) {
        return vueloService.crearVuelo(vuelo);
    }

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