package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Vuelo;

import java.util.List;
import java.util.Optional;

public interface VueloService {
    public void crearVuelo(Vuelo vuelo);
    List<Vuelo> listarVuelos();
    Vuelo devolverVuelo(Long id);
    Vuelo actualizarVuelo(Vuelo vuelo);
    void borrarVuelo(Long id);
    List<Vuelo> getByOrigenyDestino(String origen, String destino);
    Optional<Vuelo> update(Vuelo vuelo);
    List<Vuelo> getOfertas(Integer ofertas);
    public double getDolar();
    public void setOfertas(Integer ofertas);
}