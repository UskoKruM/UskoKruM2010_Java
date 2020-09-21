package Herencia;

/**
 *
 * @author UskoKruM2010
 */
public class Alumno extends Persona {

    double notaFinal;

    @Override
    public String nombreCompleto() {
        return apellidos + " , " + nombres;
    }
}
