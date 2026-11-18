package modulo3_2_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        double precioUnitario = 15.0;
        int cantidad = 2;

        // TODO: calcula subtotal, impuesto y total.
     double subtotal = precioUnitario * cantidad;   
     double impuestoTotal = subtotal * 0.21; 
     double total = subtotal + impuestoTotal;
     System.out.println("Subtotal: " + subtotal);
     System.out.println("Impuesto: " + impuestoTotal);
     System.out.println("Total: " + total);
    }
}
