package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AutoClasico extends Vehiculo {
    public AutoClasico(TipoVehiculo tipo, String marca, String modelo, String color){
        super(tipo, marca, modelo, color);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
