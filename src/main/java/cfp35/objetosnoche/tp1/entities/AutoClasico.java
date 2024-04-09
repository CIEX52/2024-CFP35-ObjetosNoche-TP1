package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AutoClasico extends Vehiculo {
    /**
     * @param marca
     * @param modelo
     * @param color
     */
    public AutoClasico(String marca, String modelo, String color){
        super(marca, modelo, color);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
