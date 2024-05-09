package codoacodo.vuelosapi.configuration;


import codoacodo.vuelosapi.model.Dolar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Anotación que indica que esta clase se ejecutará al inicio de la aplicación
public class VueloConfiguration {


    @Bean // Anotación que indica que el método que sigue es un Bean de Spring
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Método que conecta con la API de DolarApi y devuelve un objeto Dolar

    public Dolar fetchDolar() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://www.dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiUrl, Dolar.class);
    }
}
