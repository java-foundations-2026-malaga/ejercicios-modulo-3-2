package modulo3_2_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        double precioUnitario = 15.0;
        int cantidad = 2;

        // TODO: calcula subtotal, impuesto y total.
        System.out.println("Subtotal: " + (precioUnitario * cantidad));
        System.out.println("Impuesto: " + ((precioUnitario * cantidad) * 0.21));
        System.out.println("Total: " + ((precioUnitario * cantidad) + ((precioUnitario * cantidad) * 0.21)));
    }
}
