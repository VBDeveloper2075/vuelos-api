package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository <Vuelo, Long>{
//    porque es una interface, extiende JPAREPOSITORY que se basa en dos tipos de datos, el tipo de entidad y el
//    tipo de identificador (id) de la entidad. En este caso, la entidad es Vuelo y el tipo de identificador es Long.
}
