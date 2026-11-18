package modulo3_2_actividad08;

public class Actividad08 {
    public static void main(String[] args) throws Exception {
        int minutos = 135;

        // TODO: calcula horas completas y minutos restantes.

        // Calcular horas completas
        int horas = minutos / 60;

        // Calcular minutos restantes
        int minutosRestantes = minutos % 60;

        // Mostrar resultado
        System.out.println("Horas: " + horas);
        System.out.println("Minutos restantes: " + minutosRestantes);
    }
}
