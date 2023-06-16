public class CrearCliente {
    public static void main(String[] args) {
        Cliente cris = new Cliente();
        cris.setNombre("Cris");
        cris.setDocumento("f99f66f3");
        cris.setTelefono("8585 6363");

        Cuenta cuentaCris = new Cuenta();
        cuentaCris.setAgencia(1);
        cuentaCris.setTitular(cris);

        System.out.println(cuentaCris.getTitular().getDocumento());

    }
}
