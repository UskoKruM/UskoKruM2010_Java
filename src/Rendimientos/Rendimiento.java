package Rendimientos;

/**
 *
 * @author UskoKruM2010
 */
public class Rendimiento {

    public static void main(String[] args) {

        int limite = 10000;

        long tiempoInicial = System.nanoTime();

        String texto = "";

        for (int i = 0; i < limite; i++) {
            texto += String.valueOf(i) + " ";
        }

        long tiempoFinal = System.nanoTime();

        System.out.println("String: " + (tiempoFinal - tiempoInicial));

        // ------------------------------------------------------------------
        long tiempoInicial1 = System.nanoTime();

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < limite; i++) {
            text.append(i).append(" ");
        }

        long tiempoFinal1 = System.nanoTime();

        System.out.println("StringBuilder: " + (tiempoFinal1 - tiempoInicial1));
        // ------------------------------------------------------------------
        System.out.println("String Builder es " + ((tiempoFinal - tiempoInicial) / (tiempoFinal1 - tiempoInicial1)) + " veces más rápido que String para concatenar valores.");
    }

}
