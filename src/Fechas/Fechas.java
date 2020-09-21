package Fechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author UskoKruM2010
 */
public class Fechas {
    
    public static void main(String[] args) {
        System.out.println(new Date());
        
        DateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println(formato.format(new Date()));
        
        DateFormat formato2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        System.out.println(formato2.format(new Date()));

    }
    
}
