package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author UskoKruM2010
 */
public class LeerArchivo {

    public static void main(String[] args) {

        FileReader archivo;
        BufferedReader lector;

        try {
            archivo = new FileReader("C:\\uskokrum2010.txt");
            if (archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) != null) {
                    System.out.println(cadena);
                }
            } else {
                System.out.println("El archivo no está listo para ser leído...");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
