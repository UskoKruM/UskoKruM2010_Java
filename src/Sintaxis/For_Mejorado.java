package Sintaxis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UskoKruM2010
 */
public class For_Mejorado {

    public static void main(String[] args) {

        List<String> paises = new ArrayList();

        paises.add("Perú");
        paises.add("Colombia");
        paises.add("Venezuela");
        paises.add("Cuba");

        for (String pais : paises) {
            System.out.println(pais);
        }

    }

}
