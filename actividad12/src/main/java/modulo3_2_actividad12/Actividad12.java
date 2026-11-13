package modulo3_2_actividad12;

public class Actividad12 {
    public static void main(String[] args) throws Exception {
        int horasTrabajadas = 35;
        double pagoPorHora = 12.5;
        double bono = 50.0;

        // TODO: calcula el sueldo semanal total.
        double sueldoBase = horasTrabajadas*pagoPorHora;
        double sueldoSemanalTotal = sueldoBase+bono;
        System.out.println("Sueldo base: "+sueldoBase+"\nBono: "+bono+"\nTotal: "+sueldoSemanalTotal);
    }
}
