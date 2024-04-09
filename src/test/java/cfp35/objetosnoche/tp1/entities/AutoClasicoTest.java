package cfp35.objetosnoche.tp1.entities;

public class AutoClasicoTest {
    public static void main(String[] args) {
        System.out.println(" --- Testing Auto Clasico sin radio ---");

        Radio radio1 = new Radio("Sony", 150);
        Radio radio2 = new Radio("Pioneer", 100);
        AutoClasico autoCalsico1 = new AutoClasico("VW", "Gol", "Rojo");

        System.out.println(autoCalsico1);
        System.out.println();

        System.out.println(" --- Agregando Radio a autoClasico1 ---");
        autoCalsico1.agregarRadio(radio1);
        System.out.println(autoCalsico1);
        System.out.println();

        System.out.println(" --- Tasando Precio de autoClasico1 ---");
        autoCalsico1.tasarVehiculo(150000f);
        System.out.println(autoCalsico1);
        System.out.println();

        System.out.println(" --- Cambiando Radio a autoClasico1 ---");
        autoCalsico1.cambiarRadio(radio2);
        ;
        System.out.println(autoCalsico1);
        System.out.println();
    }
}
