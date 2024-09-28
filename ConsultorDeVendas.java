package listapoo.funcionario;

public class ConsultorDeVendas extends Funcionario {
    private double valorBonusMensal;

    public ConsultorDeVendas(String nome, char sexo, char nivel, String[] dependentes, double valorBonusMensal) {
        super(nome, sexo, nivel, dependentes);
        this.valorBonusMensal = valorBonusMensal;
    }


    public void calcularSalario() {
        double salarioBase = 0;
        if (nivel == 'T') {
            salarioBase = 2000.00;
        } else if (nivel == 'P') {
            salarioBase = 3500.00;
        } else if (nivel == 'S') {
            salarioBase = 5000.00;
        }
        double salarioTotal = salarioBase + valorBonusMensal;
        System.out.println("Salário total: R$ " + salarioTotal);
    }
}
