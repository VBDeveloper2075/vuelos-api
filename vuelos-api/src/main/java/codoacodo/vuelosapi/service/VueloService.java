package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Vuelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface VueloService {
    public void crearVuelo(Vuelo vuelo);
    List<Vuelo> listarVuelos();
    Vuelo devolverVuelo(Long id);
    Vuelo actualizarVuelo(Vuelo vuelo);
    void borrarVuelo(Long id);

    List<Vuelo> getByOrigen(String origen);

    Optional<Vuelo> update(Vuelo vuelo);

    List<Vuelo> getOfertas(int ofertas);

    void getOfertas(Integer ofertas);
}