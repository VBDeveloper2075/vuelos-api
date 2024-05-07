package codoacodo.vuelosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vuelo {
    @Setter
    @Id
//    ver si funciona el autoincremental, y si no, borrar lineas 4 y 21. en workbench funciona poniendo el id
//    manualmente.

    private Long id;
    private String destino;
    private LocalDateTime fecha_hora_llegada;
    private LocalDateTime fecha_hora_salida;
    private String frecuencia;
    private String origen;
    private double precio_en_pesos;

}
