package Sintaxis;

import java.util.Scanner;

/**
 *
 * @author UskoKruM2010
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner youtube = new Scanner(System.in);

        int numero1, numero2, opcion;

        do {
            System.out.println("Ingrese Número 1: ");
            numero1 = youtube.nextInt();
            System.out.println("Ingrese Número 2: ");
            numero2 = youtube.nextInt();

            do {
                System.out.println("1.- Sumar.");
                System.out.println("2.- Restar.");
                System.out.println("3.- Multiplicar.");
                System.out.println("4.- Dividir.");
                System.out.println("5.- Salir.");
                System.out.println("\nIngrese una opción: ");
                opcion = youtube.nextInt();
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {
                case 1:
                    System.out.println(numero1 + numero2);
                    break;
                case 2:
                    System.out.println(numero1 - numero2);
                    break;
                case 3:
                    System.out.println(numero1 * numero2);
                    break;
                case 4:
                    System.out.println(numero1 / numero2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gracias!");
            }
        } while (opcion != 5);
    }

}
