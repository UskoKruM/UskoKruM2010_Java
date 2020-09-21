package Polimorfismo;

/**
 *
 * @author UskoKruM2010
 */
public class Prueba {

    public static void main(String[] args) {

        CuentaAhorro CA_1 = new CuentaAhorro();
        CA_1.saldo = 5000;
        
        System.out.println(CA_1.calcularInteres());
        
        CuentaPlazoFijo CPF_1 = new CuentaPlazoFijo();
        CPF_1.saldo = 5000;
        
        System.out.println(CPF_1.calcularInteres());

    }

}
