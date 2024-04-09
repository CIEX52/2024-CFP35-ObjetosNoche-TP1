package cfp35.objetosnoche.tp1.entities;

public class AutoNuevoTest {
    public static void main(String[] args) {
        System.out.println(" --- Testing Auto Nuevo ---");

        Radio radio2 = new Radio("Philco", 180);
        AutoNuevo autoNuevo1 = new AutoNuevo("Peugeot", "408", "Negro", new Radio("Samsung", 200));

        System.out.println(autoNuevo1);
        System.out.println();

        System.out.println(" --- Tasando Precio de autoNuevo1 ---");
        autoNuevo1.tasarVehiculo(350000f);
        System.out.println(autoNuevo1);
        System.out.println();

        System.out.println(" --- Cambiando Radio a autoNuevo1 ---");
        autoNuevo1.cambiarRadio(radio2);
        ;
        System.out.println(autoNuevo1);
        System.out.println();
    }
}
