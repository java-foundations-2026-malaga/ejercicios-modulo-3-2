package modulo3_2_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        double precioUnitario = 15.0;
        int cantidad = 2;
        double subtotal = precioUnitario*cantidad;
        double impuesto = 6.3;
        double total = subtotal+impuesto;
        // TODO: calcula subtotal, impuesto y total.
        System.out.println("Subtotal: "+subtotal+"\nImpuesto: "+impuesto+"\nTotal: "+total);
    }
}
