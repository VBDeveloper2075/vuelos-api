package codoacodo.vuelosapi;

import codoacodo.vuelosapi.model.Vuelo;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class VuelosApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuelosApiApplication.class, args);

    }
}


