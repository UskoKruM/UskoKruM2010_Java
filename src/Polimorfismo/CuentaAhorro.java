package Polimorfismo;

/**
 *
 * @author UskoKruM2010
 */
public class CuentaAhorro extends Cuenta {

    @Override
    public double calcularInteres() {
        return this.saldo * 0.05;
    }

}
