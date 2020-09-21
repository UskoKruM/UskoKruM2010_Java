package Arrays;

import java.util.HashMap;

/**
 *
 * @author UskoKruM2010
 */
public class Diccionario {

    public static void main(String[] args) {

        HashMap diccionario = new HashMap();

        diccionario.put("usuario", "UskoKruM2010");
        diccionario.put("país", "Perú");
        diccionario.put("ciudad", "Chiclayo");

        String valor = diccionario.get("ciudad").toString();
        
        System.out.println(valor);

    }

}
