package modulo3_2_actividad07;

public class Actividad07 {
    public static void main(String[] args) throws Exception {
        double precioUnitario = 15.0;
        int cantidad = 2;

        double preCant = (precioUnitario * cantidad);
        double ivaAplicado = (preCant * 0.21);

        System.out.println ("Subtotal: " + preCant);
        System.out.println ("Impuesto: " + ivaAplicado);
        System.out.println ("Total: " + (preCant + ivaAplicado));
    }
}
