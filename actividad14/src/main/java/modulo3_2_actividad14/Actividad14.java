package modulo3_2_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        double precio = 20.0;
        int cantidad = 3;
        double porcentajeDescuento = 10.0;

        // TODO: calcula subtotal, descuento y total final.
        System.out.println("Subtotal: " + precio * cantidad);
        System.out.println("Descuento: " + ((precio * cantidad) * (porcentajeDescuento / 100f)));
        System.out.println("Total final: " + ((precio * cantidad) - ((precio * cantidad) * (porcentajeDescuento / 100f))));


    }
}
