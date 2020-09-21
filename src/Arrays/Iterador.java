package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author UskoKruM2010
 */
public class Iterador {

    public static void main(String[] args) {

        List<String> lenguajes = new ArrayList();

        lenguajes.add("Java");
        lenguajes.add("PHP");
        lenguajes.add("VB.NET");
        lenguajes.add("JavaScript");
        lenguajes.add("C++");

        Iterator<String> it = lenguajes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
