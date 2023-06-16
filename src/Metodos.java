public class Metodos {
    public static void main(String[] args) {
        Cuenta cuentaCris = new Cuenta();
        Cuenta cuentaExtra = new Cuenta();

        cuentaCris.setSaldo(3500);
        cuentaCris.depositar(1000);
        System.out.println("Saldo en cuenta de Cris " + cuentaCris.getSaldo());

        cuentaCris.retirar(500);
        System.out.println("Saldo despues de retirar " + cuentaCris.getSaldo());


        cuentaExtra.setSaldo(7000);
        System.out.println("Cuenta extra, saldo: " + cuentaExtra.getSaldo());
        cuentaExtra.transferir(1000, cuentaCris);
        System.out.println("Saldo de la cuenta extra despues de transferencia " + cuentaExtra.getSaldo());
        System.out.println("Saldo en cuenta de Cris despues de tranferencia " + cuentaCris.getSaldo());

    }
}
