package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;

@Getter
public class AutoClasico extends Vehiculo {
    /**
     * @param marca
     * @param modelo
     * @param color
     */
    public AutoClasico(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
