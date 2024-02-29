package codoacodo.vuelosapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vuelo {
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
