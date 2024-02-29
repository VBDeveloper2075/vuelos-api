package codoacodo.vuelosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
>>>>>>> 61f9eb74a5e74f75ea916532efe533ed44b85cbe
public class VuelosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuelosApiApplication.class, args);
	}
<<<<<<< HEAD
=======

	//cuando pongo localhost:8080/ veo el mensaje "Hola Mundo"
	@GetMapping("/")
	public String hola() {
		return "Hola Mundo";
	}

	//en localhost:8080/adios => veo el mensaje "Adios Mundo"
	@GetMapping("/adios")
	public String adios() {
		return "Adios Mundo";
	}

>>>>>>> 61f9eb74a5e74f75ea916532efe533ed44b85cbe
}
