package Excepciones;

/**
 *
 * @author UskoKruM2010
 */
public class TryCatch {

    public static void main(String[] args) {

        try {
            // throw new Exception();
        } catch (Exception e) {
            System.out.println("He lanzado una excepción");
        } finally {
            System.out.println("Esto es un error finalizado...");
        }
    }

}
