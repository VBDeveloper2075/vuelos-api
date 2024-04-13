package codoacodo.vuelosapi.service;

import codoacodo.vuelosapi.model.Vuelo;
import codoacodo.vuelosapi.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    @Override
    public Vuelo crearVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
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
}
