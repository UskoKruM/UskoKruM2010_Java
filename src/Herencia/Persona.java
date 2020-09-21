package Herencia;

/**
 *
 * @author UskoKruM2010
 */
public class Persona {

    String apellidos;
    String nombres;
    int edad;
    char sexo;

    public String nombreCompleto() {
        return apellidos + " , " + nombres;
    }

}
