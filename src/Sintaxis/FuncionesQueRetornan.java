package Sintaxis;

/**
 *
 * @author UskoKruM2010
 */
public class FuncionesQueRetornan {

    public int Multiplicar(int Numero) {
        return Numero * 5;
    }

    public double Calcular_Descuento(double Sueldo) {
        return Sueldo * 0.1;
    }

    public static void main(String[] args) {

        FuncionesQueRetornan instancia = new FuncionesQueRetornan();

        System.out.println("El Descuento Es : " + instancia.Calcular_Descuento(2000));
    }

}
