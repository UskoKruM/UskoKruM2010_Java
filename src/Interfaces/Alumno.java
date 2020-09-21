package Interfaces;

/**
 *
 * @author UskoKruM2010
 */
public class Alumno implements Persona {

    @Override
    public void dimeTuNombre(String nombre) {
        System.out.println("Mi nombre es: " + nombre);
    }

    @Override
    public void dimeTuEdad(int edad) {
        System.out.println("Mi edad es: " + edad);
    }

}
