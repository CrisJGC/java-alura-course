public class Acceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(1);
        cuenta.depositar(400);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
    }
}
