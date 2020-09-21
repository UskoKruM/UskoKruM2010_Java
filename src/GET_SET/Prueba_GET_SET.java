package GET_SET;

/**
 *
 * @author UskoKruM2010
 */
public class Prueba_GET_SET {

    public static void main(String[] args) {

        Alumno alum_1;

        alum_1 = new Alumno();

        alum_1.nota = 20;

        System.out.println(alum_1.nota);
        
        alum_1.setNombre("Oscar");
        
        System.out.println(alum_1.getNombre());
    }

}
