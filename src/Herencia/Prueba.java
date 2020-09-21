package Herencia;

/**
 *
 * @author UskoKruM2010
 */
public class Prueba {

    public static void main(String[] args) {

        Alumno al_1 = new Alumno();

        al_1.apellidos = "Gomez Torres";
        al_1.nombres = "Juan Alberto";
        al_1.edad = 25;
        al_1.notaFinal = 15.6;

        Docente doc_1 = new Docente();

        doc_1.sexo = 'M';
        doc_1.edad = 45;
        doc_1.sueldo = 1500;
        
        System.out.println(al_1.nombreCompleto());

    }

}
