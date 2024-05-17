package codoacodo.vuelosapi.utils;

import codoacodo.vuelosapi.model.Vuelo;
import codoacodo.vuelosapi.model.VueloDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VueloUtils {
//    completar en service con la anotacion Autowired

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public List<Vuelo> detectOffers(List<Vuelo> flights, Integer offerPrice) {
        return flights.stream()
                .filter(flight -> flight.getPrecio_en_pesos() < offerPrice)
                .collect(Collectors.toList());
    }

    public VueloDto flightMapper(Vuelo vuelo, double price){
        return new VueloDto(vuelo.getId(),vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFecha_hora_salida(),
                vuelo.getFecha_hora_llegada(), vuelo.getPrecio_en_pesos() * price, vuelo.getFrecuencia(),
                vuelo.getCompany());
    }
}
