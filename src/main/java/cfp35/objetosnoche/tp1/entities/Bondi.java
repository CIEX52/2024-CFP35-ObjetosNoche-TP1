package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;

@Getter
public final class Bondi extends Vehiculo{
    
    /**
     * @param marca
     * @param modelo
     * @param color
     */
    public Bondi(String marca, String modelo, String color) {
        super(color, marca, modelo);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
