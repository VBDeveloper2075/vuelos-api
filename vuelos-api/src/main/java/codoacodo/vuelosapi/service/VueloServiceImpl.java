package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Vuelo;
import codoacodo.vuelosapi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    public VueloRepository vueloRepository;

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
    public Object getOfertas(Integer ofertas) {
        return null;
    }
    
    @Override
    public void getOfertas(Integer ofertas){
        List<Vuelo> vuelos = new ArrayList<>();
    };
}
