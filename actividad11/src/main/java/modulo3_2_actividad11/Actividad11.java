package modulo3_2_actividad11;

public class Actividad11 {
    public static void main(String[] args) throws Exception {
        int caramelos = 29;
        int alumnos = 6;

        // TODO: calcula reparto y sobrantes.
        int reparto = caramelos / alumnos;
        int sobrantes = caramelos % alumnos;

        System.out.println("Cada alumno recibe: " + reparto);
        System.out.println("Sobran: " + sobrantes);
    }
}
