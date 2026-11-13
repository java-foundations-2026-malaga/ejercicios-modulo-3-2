package modulo3_2_actividad15;

public class Actividad15 {
    public static void main(String[] args) throws Exception {
        int monedas = 12;
        int enemigosDerrotados = 3;
        int tiempoRestante = 45;
        // TODO: monedas valen 10, enemigos 100 y cada segundo restante 2.
        int puntuacionTotal = (monedas*10)+(enemigosDerrotados*100)+(tiempoRestante*2);
        System.out.println("Puntuacion total: "+puntuacionTotal);
    }
}
