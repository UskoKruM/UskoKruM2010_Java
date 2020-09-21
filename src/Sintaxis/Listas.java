package Sintaxis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UskoKruM2010
 */
public class Listas {

    public static void main(String[] args) {

        List<String> Nombres;

        Nombres = new ArrayList<>();

        Nombres.add("Perú");
        Nombres.add("Colombia");
        Nombres.add("México");

        System.out.println(Nombres.contains("Colombia"));

    }

}
