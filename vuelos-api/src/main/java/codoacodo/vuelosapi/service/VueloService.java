package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Vuelo;
import java.util.List;

public interface VueloService {
    public void crearVuelo(Vuelo vuelo);
    List<Vuelo> listarVuelos();
    Vuelo devolverVuelo(Long id);
    Vuelo actualizarVuelo(Vuelo vuelo);
    void borrarVuelo(Long id);
}