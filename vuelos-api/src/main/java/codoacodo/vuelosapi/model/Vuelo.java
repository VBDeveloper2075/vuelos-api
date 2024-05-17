package codoacodo.vuelosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vuelo {
    @Setter
    @Getter
    @Id
//    ver si funciona el autoincremental, y si no, borrar lineas 4 y 21. en workbench funciona poniendo el id
//    manualmente.

    private Long id;
    private String origen;
    private String destino;
    private LocalDateTime fecha_hora_llegada;
    private LocalDateTime fecha_hora_salida;
    private String frecuencia;
    private double precio;

    public Double getPrecio_en_pesos()    {
        Double precio_en_pesos = precio * 100;
        return precio_en_pesos;
    }

    public Company getCompany() {
        return Company.AEROLINEAS;
    }
}
