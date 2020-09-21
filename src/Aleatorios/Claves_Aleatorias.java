package Aleatorios;

import java.util.UUID;

/**
 *
 * @author UskoKruM2010
 */
public class Claves_Aleatorias {

    public static void main(String[] args) {
        
        // UUID (Unique Universal Identifier)
        
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        System.out.println(UUID.randomUUID().toString().toUpperCase().substring(0, 6));
        
    }

}
