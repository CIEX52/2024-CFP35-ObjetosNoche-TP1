package cfp35.objetosnoche.tp1.entities;


public class ColectivoTest {
    public static void main(String[] args) {
        System.out.println(" --- Testing Colectivo ---");

        Radio radio1 = new Radio("Sony", 150);
        Radio radio2 = new Radio("Pioneer", 100);
        Colectivo colectivo1 = new Colectivo("Mercedez", "Bus-2P", "Blanco");

        System.out.println(colectivo1);
        System.out.println();

        System.out.println(" --- Agregando Radio a colectivo1 ---");
        colectivo1.agregarRadio(radio1);
        System.out.println(colectivo1);
        System.out.println();

        System.out.println(" --- Tasando Precio de colectivo1 ---");
        colectivo1.tasarVehiculo(2500000f); 
        System.out.println(colectivo1);
        System.out.println();

        System.out.println(" --- Cambiando Radio a colectivo1 ---");
        colectivo1.cambiarRadio(radio2);;
        System.out.println(colectivo1);
        System.out.println();
    }
}
