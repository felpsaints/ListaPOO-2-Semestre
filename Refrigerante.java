package listapoo.refrigerante;

public class Refrigerante {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Refrigerante(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public boolean efetuarVenda(int quantidade) {
        if (qtdEstoque >= quantidade) {
            qtdEstoque -= quantidade;
            return true;
        } else {
            System.out.println("Estoque insuficiente para " + nome);
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
}
