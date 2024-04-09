package cfp35.objetosnoche.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class Radio {
    String marca;
    Integer potencia;

    @Override
    public String toString() {
        return marca + ", " + potencia + "W";
    }
}
