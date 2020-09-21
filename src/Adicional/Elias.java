package Adicional;

import java.util.Scanner;

/**
 *
 * @author USKOKRUM
 */
public class Elias {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] elementos = new int[5];

        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Ingrese elemento " + (i + 1) + " : ");
            elementos[i] = lector.nextInt();
        }

        for (int z = 0; z < elementos.length; z++) {
            System.out.println("Elemento " + (z + 1) + ": " + elementos[z]);
        }

    }

}
