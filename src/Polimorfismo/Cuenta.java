package Polimorfismo;

/**
 *
 * @author UskoKruM2010
 */
public abstract class Cuenta {

    public String numeroCuenta;
    public double saldo;
    public String titular;

    public abstract double calcularInteres();

}
