package Polimorfismo;

/**
 *
 * @author UskoKruM2010
 */
public class CuentaPlazoFijo extends Cuenta {

    @Override
    public double calcularInteres() {
        return this.saldo * 0.12;
    }

}
