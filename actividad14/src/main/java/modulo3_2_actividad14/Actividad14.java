package modulo3_2_actividad14;

public class Actividad14 {
    public static void main(String[] args) throws Exception {
        double precio = 20.0;
        int cantidad = 3;
        double porcentajeDescuento = 10.0;

double precioSin = (precio * cantidad);
double descuento = (precioSin / 10.0);
double precioFinal = (precioSin - descuento);

System.out.println ("Subtotal: " + precioSin);
System.out.println ("Descuento: " + descuento);
System.out.println ("Total final: " + precioFinal);
        // TODO: calcula subtotal, descuento y total final.
    }
}
