package Archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author UskoKruM2010
 */
public class EscribirArchivo {

    public static void main(String[] args) throws IOException {

        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter("C:\\uskokrum2010.txt");
            escritor = new PrintWriter(archivo);

            escritor.println("www.youtube.com/UskoKruM2010");
            escritor.print("Chiclayo");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            archivo.close();
        }

    }

}
