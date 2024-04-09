package cfp35.objetosnoche.tp1.entities;

public class AutoNuevo extends Vehiculo {
    /**
     * @param color
     * @param marca
     * @param modelo
     * @param radio
     */
    public AutoNuevo(String color, String marca, String modelo, Radio radio) {
        super(color, marca, modelo);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
