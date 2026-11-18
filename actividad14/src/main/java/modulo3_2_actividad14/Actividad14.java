package modulo3_2_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        double precio = 20.0;
        int cantidad = 3;
        double porcentajeDescuento = 10.0;

        // TODO: calcula subtotal, descuento y total final.
        double subtotal = precio * cantidad;
        double descuento = subtotal * porcentajeDescuento / 100;
        double totalFinal = subtotal - descuento;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total final: " + totalFinal);
    }
}
