package StringBuilder;

/**
 *
 * @author UskoKruM2010
 */
public class ClaseStringBuilder {

    public static void main(String[] args) {

//        String nombres = "";
//
//        nombres += "Oscar";
//        nombres += " / UskoKruM2010";
//        nombres += " / Perú";
//        
//        System.out.println(nombres);
        StringBuilder text = new StringBuilder();

        text.append("UskoKruM2010");
        text.append(" / DrossRotzank").append(" / MarginalMedia");
        
        System.out.println(text.toString());

    }

}
