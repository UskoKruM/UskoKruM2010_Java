package Sintaxis;

/**
 *
 * @author UskoKruM2010
 */
public class SWITCH {

    public static void main(String[] args) {

        int opcion = 5;

        switch (opcion) {
            case 1:
                System.out.println("El número es 1.");
                break;
            case 2:
                System.out.println("El número es 2.");
                break;
            case 3:
                System.out.println("El número es 3.");
                break;
            case 4:
                System.out.println("El número es 4.");
                break;
            default:
                System.out.println("El número no está dentro del rango.");
        }
    }
}
