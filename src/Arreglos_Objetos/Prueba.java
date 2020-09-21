package Arreglos_Objetos;

/**
 *
 * @author UskoKruM2010
 */
public class Prueba {

    public static void main(String[] args) {

        YouTuber vector[] = new YouTuber[5];

        vector[0] = new YouTuber("UskoKruM2010", 50000, "Perú");

        System.out.println(vector[0].nombre + " " + vector[0].pais);

        vector[1] = new YouTuber("DrossRotzank", 10000000, "Argentina");

        System.out.println(vector[1].nombre + " " + vector[1].pais);

        vector[2] = new YouTuber("MarginalMedia", 2000000, "España");
        
        System.out.println(vector[2].nombre + " " + vector[2].seguidores);

    }

}
