package POO;

/**
 *
 * @author UskoKruM2010
 */
public class Creacion_Objetos_2 {

    public static void main(String[] args) {

        Persona Persona_X = new Persona("Lopez", "José", 46, 4200);

        System.out.println(Persona_X.NombreCompleto());

        Persona Persona_Z = new Persona(56);

        Persona Persona_H = new Persona(4500.4);
    }

}
