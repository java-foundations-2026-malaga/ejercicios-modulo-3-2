package modulo3_2_actividad12;

public class Actividad12 {
    public static void main(String[] args) throws Exception {
        int horasTrabajadas = 35;
        double pagoPorHora = 12.5;
        double bono = 50.0;

        // TODO: calcula el sueldo semanal total.
        double sueldoSemanal = horasTrabajadas * pagoPorHora;
        double sueldoTotal = sueldoSemanal + bono;

        System.out.println("Sueldo base: " + sueldoSemanal);
        System.out.println("Bono: " + bono);
        System.out.println("Total: " + sueldoTotal);
    }
}
