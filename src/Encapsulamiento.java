public class Encapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("Cris");
        cliente.setDocumento("f9f6g3h");

        cuenta.setTitular(cliente);
        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
    }
}
