package modulo3_2_actividad12;

public class Actividad12 {
	public static void main(String[] args) throws Exception {

        double horasTrabajadas = 35.0;
        double pagoPorHora = 12.5;
        double bono = 50.0;

        double sueldoBase = horasTrabajadas * pagoPorHora;

        double total = sueldoBase + bono;

        System.out.println("Sueldo base: " + sueldoBase);

        System.out.println("Bono: " + bono);

        System.out.println("Total: " + total);

    }
}