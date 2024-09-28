
package listapoo.conta;

public class Conta {
    private String nomeCliente;
    private int numeroConta;
    protected double saldo;
    
    public Conta(String nomeCliente, int numeroConta, double saldoInicial){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    
    public void depositarValor(float valor){
        if(valor > 0){
            saldo+= valor;
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Menos que 0 nao da, ne amigo?");
        } 
    }
    public boolean retirarValor(double valor){
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque Realizado");
            return true;
        }else{
            System.out.println("Sem saldo");
        return false;
        }
    }
    public double consultarValorDisponivel(){
        return saldo;
    }
     
}
