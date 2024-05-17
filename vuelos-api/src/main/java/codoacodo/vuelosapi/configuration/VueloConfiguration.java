package codoacodo.vuelosapi.configuration;

import codoacodo.vuelosapi.model.Dolar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;

@Configuration
public class VueloConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public Dolar fetchDolar() {
        RestTemplate restTemplate = restTemplate();
        String dolarApiUrl = "https://dolarapi.com/v1/dolares/blue"; // URL de la API del dólar
        Dolar dolar = restTemplate.getForObject(dolarApiUrl, Dolar.class);
        return dolar;
    }
}