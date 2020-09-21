package Sintaxis;

import java.util.Scanner;

/**
 *
 * @author UskoKruM2010
 */
public class LecturaDeDatos {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int Numero;

        System.out.println("Ingrese Número");
        Numero = lector.nextInt();
        
        System.out.println(Numero);
    }

}
