package codoacodo.vuelosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vuelo {

    @Id
    private Long id;
    private String origen;
    private String destino;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraLlegada;
    private double precioEnPesos;
    private String frecuencia;

    public Vuelo(long id, String buenosAires, String roma, String s, String s1, int precioEnPesos, String diario) {
    }
}
