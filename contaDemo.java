package listapoo.conta;

public class contaDemo {
    public static void main(String[] args){
        Conta conta = new Conta("Felipe",777, 3700.00);
        
        conta.depositarValor(200); //depositando
        
        conta.retirarValor(100); //retirando
        
        double saldoFinal = conta.consultarValorDisponivel();
        System.out.println("Seu saldo é: " + saldoFinal);
    }
    
}
