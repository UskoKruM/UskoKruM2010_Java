package Constructores;

/**
 *
 * @author UskoKruM2010
 */
public class Empleado {

    String nombre;
    int edad;
    double salario;

    public Empleado(String nom) {
        this.nombre = nom;
    }

    public Empleado(String nom, int Ed) {
        this.nombre = nom;
        this.edad = Ed;
    }
}
