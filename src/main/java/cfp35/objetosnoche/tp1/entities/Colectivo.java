package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;

@Getter
public final class Colectivo extends Vehiculo{
    
    /**
     * @param marca
     * @param modelo
     * @param color
     */
    public Colectivo(String marca, String modelo, String color) {
        super(color, marca, modelo);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
