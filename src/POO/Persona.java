package POO;

/**
 *
 * @author UskoKruM2010
 */
public class Persona {

    String Apellidos;
    String Nombres;
    int Edad;
    double Sueldo;

    public Persona(String Apellidos, String Nombres, int Edad, double Sueldo) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Edad = Edad;
        this.Sueldo = Sueldo;
    }

    public Persona(int Edad) {
        this.Edad = Edad;
    }

    public Persona(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    String NombreCompleto() {
        return Apellidos + " , " + Nombres;
    }

}
