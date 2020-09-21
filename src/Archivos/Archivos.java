package Archivos;

import java.io.File;

/**
 *
 * @author UskoKruM2010
 */
public class Archivos {

    public static void main(String[] args) {

        File archivo1 = new File("C:\\pruebaCambiada.txt");

        System.out.println("Existe: " + archivo1.exists());
        System.out.println("¿Se puede leer? " + archivo1.canRead());
        System.out.println("¿Se puede escribir? " + archivo1.canWrite());
        File archivo2 = new File("C:\\uskokrum2010\\");
        System.out.println("¿Existe? " + archivo2.exists());
        System.out.println(archivo2.mkdir());
        File archivo3 = new File("C:\\uskokrum2010\\carpeta1\\carpeta2\\carpeta3\\");

        System.out.println(archivo3.mkdirs());

        System.out.println(archivo1.renameTo(new File("C:\\pruebaCambiada.txt")));

        System.out.println(archivo1.delete());

    }

}
