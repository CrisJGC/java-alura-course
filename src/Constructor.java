public class Constructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cuenta c2 = new Cuenta(5 );

        System.out.println(Cuenta.getTotal());
        //cuenta.setAgencia(85);

        //System.out.println(cuenta.getAgencia());
    }
}
