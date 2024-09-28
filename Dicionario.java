package listapoo.dicionario;

public class Dicionario {
    private String[] palavras;
    private String[] significados;

    public Dicionario(String[] palavras, String[] significados) {
        this.palavras = palavras;
        this.significados = significados;
    }

    public String pesquisar() {
        return significados[0]; // Retorna o significado da primeira palavra
    }

    public String pesquisar(String palavra) {
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equalsIgnoreCase(palavra)) {
                return significados[i];
            }
        }
        return "Palavra não encontrada.";
    }

    public String pesquisar(int indice) {
        if (indice >= 0 && indice < significados.length) {
            return significados[indice];
        }
        return "Índice inválido.";
    }

    public boolean validarPalavra(String palavra) {
        for (String p : palavras) {
            if (p.equalsIgnoreCase(palavra)) {
                System.out.println("Palavra já existente no dicionário.");
                return false;
            }
        }
        return true;
    }
}
