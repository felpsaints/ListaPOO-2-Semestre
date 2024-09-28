package listapoo.funcionario;

public class Funcionario {
    private String nome;
    private char sexo;
    protected char nivel;
    private String[] dependentes;

    public Funcionario(String nome, char sexo, char nivel, String[] dependentes) {
        this.nome = nome;
        if (validarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = ' '; 
        }
        this.nivel = nivel;
        this.dependentes = dependentes;
    }

    private boolean validarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            return true;
        }
        System.out.println("Sexo inválido");
        return false;
    }

    public void calcularSalario() {
        double salario = 0;
        if (nivel == 'T') {
            salario = 2000.00;
        } else if (nivel == 'P') {
            salario = 3500.00;
        } else if (nivel == 'S') {
            salario = 5000.00;
        }
        System.out.println("Salário: R$ " + salario);
    }

    public void mostrarDependentes() {
        for (String dependente : dependentes) {
            System.out.println(dependente);
        }
    }
}
