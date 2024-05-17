package codoacodo.vuelosapi.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class VueloDto {
        private Long id;
        private String origen;
        private String destino;
        private LocalDateTime fecha_hora_salida;
        private LocalDateTime fecha_hora_llegada;
        private double precio_en_pesos;
        private String frecuencia;
        private Company company;
}
