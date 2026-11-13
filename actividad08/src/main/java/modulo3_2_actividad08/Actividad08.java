package modulo3_2_actividad08;

public class Actividad08 {
    public static void main(String[] args) throws Exception {
        int minutos = 135;

        // TODO: calcula horas completas y minutos restantes.
        int horasCompletas = minutos/60;
        int minutosRestantes = minutos%60;
        System.out.println("Horas: "+horasCompletas+"\nMinutos restantes: "+minutosRestantes);
    }
}
