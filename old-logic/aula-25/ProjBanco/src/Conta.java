public class Conta {
    //valores
    private int numeroConta;
    private int senha;
    private double saldo;
    
    //metodos(set get e toString)
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "\nConta Bancária: " +
               "\nNumero da Conta: " + numeroConta;
    }
    
    //metodos(calculos)
    public boolean verificarSeHaSaldo(double valor){
        if(this.saldo>=valor){
            return true;
        }else{
            return false;
        }
    }
    public double verificarSaldo(){
        return this.saldo;
    }
    public void sacar(double valor){
        this.saldo=this.saldo-valor;
    }
    public void depositar(double valor){
        this.saldo=this.saldo+valor;
    }
    
    public double calcularCreditoEspecial(double valor){
        return valor-this.saldo;
    }
}
