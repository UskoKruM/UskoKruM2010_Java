package Aleatorios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UskoKruM2010
 */
public class Numeros_Aleatorios {

    public static void main(String[] args) {

        List<Double> valores = new ArrayList();

        for (int i = 0; i < 50; i++) {
            valores.add(Math.random() * 10000);
        }

        for (Double valor : valores) {
            System.out.println(valor);
        }

    }

}
