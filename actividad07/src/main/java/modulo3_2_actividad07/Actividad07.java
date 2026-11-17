package modulo3_2_actividad07;

public class Actividad07 {
	public static void main(String[] args) throws Exception {

        double precioUnitario = 15.0;

        int cantidad = 2;

        double subtotal = precioUnitario * cantidad;

        double impuesto = subtotal * 0.21;

        double total = subtotal + impuesto;

        System.out.println("Subtotal: " + subtotal);

        System.out.println("Impuesto: " + impuesto);

        System.out.println("Total: " + total);

    }

}