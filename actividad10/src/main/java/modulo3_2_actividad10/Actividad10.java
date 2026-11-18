package modulo3_2_actividad10;

public class Actividad10 {
    public static void main(String[] args) throws Exception {
        double radio = 3.0;
        double pi = 3.1416;

       // TODO: calcula perimetro y area.
        double perimetro = 2 * pi * radio;
        double area = pi * Math.pow(radio, 2);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
