package cfp35.objetosnoche.tp1.entities;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private Float precio;
    public Radio radio;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void tasarVehiculo(Float precio) {
        this.precio = precio;
    }

    public void cambiarRadio(Radio nuevaRadio) {
        this.radio = nuevaRadio;
    }

    public void agregarRadio(Radio radio) {
        if (this.radio == null) {
            this.radio = radio;
        } else {
            System.out.println("Este vehículo ya tiene una radio.");
        }
    }
}
