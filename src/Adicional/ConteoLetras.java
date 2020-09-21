package Adicional;

import java.util.Scanner;

/**
 *
 * @author UskoKruM2010
 */
public class ConteoLetras {

    public int contarLetras(String frase) {
        char letras[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int numeroLetras = 0;

        String fraseMinusculas = frase.toLowerCase();

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            char letra = fraseMinusculas.charAt(i);
            if (letra != ' ') {
                for (int j = 0; j < letras.length; j++) {
                    if (letra == letras[j]) {
                        numeroLetras++;
                        break;
                    }

                }
            }
        }
        return numeroLetras;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese palabra o frase: ");
        frase = lector.nextLine();

        ConteoLetras contador = new ConteoLetras();
        System.out.println(contador.contarLetras(frase));
    }

}
