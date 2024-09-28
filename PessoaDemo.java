package listapoo.pessoa;

public class PessoaDemo {
    public static void main(String[] args) {
        Pessoa[] pessoas = {
            new Pessoa("Ana", 25, 1.50, 45, "Feminino"),
            new Pessoa("Bruno", 30, 1.75, 70, "Masculino"),
            new Pessoa("Carlos", 28, 1.80, 85, "Masculino"),
            new Pessoa("Diana", 22, 1.65, 95, "Feminino")
        };

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
