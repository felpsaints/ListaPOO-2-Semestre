package listapoo.conta;

public class contaEspecial extends Conta {
    private double limite;


    public contaEspecial(String nomeCliente, int numeroConta, double saldoInicial, double limite) {
        super(nomeCliente, numeroConta, saldoInicial); // esse aqui ta chamando o construtor da superclasse
        this.limite = limite;
    }

    public boolean retirarValor(double valor) {
        if (valor > 0 && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque realizado (Conta Especial).");
            return true;
        } else {
            System.out.println("Sem saldo");
            return false;
        }
    }

    public double consultarValorDisponivel() {
        return saldo + limite;
    }
}
