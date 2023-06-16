class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total = 0;

    public static int getTotal() {
        return total;
    }

    // constructor

    public Cuenta(){

    }

    public Cuenta(int agencia){
        if(agencia <=0){
            System.out.println("No puedes usar negativos o cero");
            this.agencia = 1;

        }else{
            this.agencia = agencia;
        }

        total++;
        System.out.println("Numero de cuentas actuales: " + total);

    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean retirar(double monto){
        if(this.saldo >= monto) {
            this.saldo = this.saldo - monto;
            return true;
        }
        return false;
    }

    public boolean transferir(double monto, Cuenta cuenta ){
        if (this.saldo >= monto){
            this.saldo = this.saldo - monto;
            //cuenta.saldo = cuenta.saldo + monto;
            cuenta.depositar(monto);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(int agencia){
        if(agencia > 0){
            this.agencia = agencia;
        }else{
            System.out.println("No colocar negativos");
        }
    }

    public int getAgencia(){
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setSaldo(int i) {
        this.saldo = i;
    }
}
