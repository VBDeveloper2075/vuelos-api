package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {
    List<Vuelo> findByOrigen(String origen);
//    return VueloRepository (null);
}