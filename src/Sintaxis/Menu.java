package Sintaxis;

import java.util.Scanner;

/**
 *
 * @author UskoKruM2010
 */
public class Menu {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            do {
                System.out.println("1.- Buenos Días.");
                System.out.println("2.- Buenas Tardes.");
                System.out.println("3.- Buenas Noches.");
                System.out.println("4.- Salir.");
                System.out.println("Ingrese una opción: ");
                opcion = leer.nextInt();
            } while (opcion < 1 || opcion > 4);
            switch (opcion) {
                case 1:
                    System.out.println("Buenos Días.");
                    break;
                case 2:
                    System.out.println("Buenas Tardes.");
                    break;
                case 3:
                    System.out.println("Buenas Noches.");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (opcion != 4);
    }

}
