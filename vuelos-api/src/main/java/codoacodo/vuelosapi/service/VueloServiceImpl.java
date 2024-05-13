package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.configuration.VueloConfiguration;
import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Vuelo;
import codoacodo.vuelosapi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    public VueloRepository vueloRepository;

    @Autowired
    public VueloConfiguration vueloConfiguration;

    @Override
    public void crearVuelo(Vuelo vuelo) {
        vueloRepository.save(vuelo);
        vueloRepository.findById(vuelo.getId());
    }

    public List<Vuelo> findById(Long id) {
        return (List<Vuelo>) (List<Vuelo>) (List<Vuelo>) Collections.singletonList(vueloRepository.findById(id).orElse(null));
    }

    @Override
    public List<Vuelo> listarVuelos() {
        return vueloRepository.findAll();
    }

    @Override
    public Vuelo devolverVuelo(Long id) {
        return vueloRepository.findById(id).orElse(null);
    }

    @Override
    public Vuelo actualizarVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    @Override
    public void borrarVuelo(Long id) {
        vueloRepository.deleteById(id);
    }

    public List<Vuelo> getByOrigen(String origen) {
        return vueloRepository.findByOrigen(origen);
    }

    @Override
    public Optional<Vuelo> update(Vuelo vuelo) {
        return Optional.empty();
    }

    @Override
    public List<Vuelo> getOfertas(Integer ofertas) {
    // obtenemos todos los vuelos de la base de datos utilizando el método findAll() del repositorio
    return vueloRepository.findAll().stream()
            // método filter() para filtrar aquellos vuelos cuyo precio es menor o igual a ofertas.
        .filter(vuelo -> vuelo.getPrecio_en_pesos()<= ofertas)
        .collect(Collectors.toList());
}

    @Override
    public void setOfertas(Integer ofertas){
        List<Vuelo> vuelos = new ArrayList<>();
    }

    @Override
    public Dolar getDolar() {
        final Dolar dolar = vueloConfiguration.fetchDolar();
        return dolar;
    }

}