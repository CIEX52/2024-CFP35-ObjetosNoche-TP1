package cfp35.objetosnoche.tp1.entities;


public class BondiTest {
    public static void main(String[] args) {
        System.out.println(" --- Testing Colectivo ---");

        Radio radio1 = new Radio("Sony", 150);
        Radio radio2 = new Radio("Pioneer", 100);
        Bondi bondi1 = new Bondi("Mercedez", "Bus-2P", "Blanco");

        System.out.println(bondi1);
        System.out.println();

        System.out.println(" --- Agregando Radio a bondi1 ---");
        bondi1.agregarRadio(radio1);
        System.out.println(bondi1);
        System.out.println();

        System.out.println(" --- Tasando Precio de bondi1 ---");
        bondi1.tasarVehiculo(2500000f); 
        System.out.println(bondi1);
        System.out.println();

        System.out.println(" --- Cambiando Radio a bondi1 ---");
        bondi1.cambiarRadio(radio2);;
        System.out.println(bondi1);
        System.out.println();
    }
}
