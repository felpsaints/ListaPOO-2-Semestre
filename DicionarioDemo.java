
package listapoo.dicionario;

public class DicionarioDemo {
    public static void main(String[] args) {
        String[] palavras = {"Java", "Funcionário", "Aluno", "Futebol"};
        String[] significados = {
            "Linguagem de programação",
            "Pessoa que trabalha",
            "Pessoa que estuda",
            "Modalidade de esporte"
        };

        Dicionario dicionario = new Dicionario(palavras, significados);

        System.out.println("Significado da primeira palavra: " + dicionario.pesquisar());
        System.out.println("Significado de 'Aluno': " + dicionario.pesquisar("Aluno"));
        System.out.println("Significado do índice 2: " + dicionario.pesquisar(2));

        dicionario.validarPalavra("Java");
        dicionario.validarPalavra("Python");
    }
}
