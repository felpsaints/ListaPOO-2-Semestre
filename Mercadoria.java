package listapoo.mercadoria;

public class Mercadoria {
    private String nome;
    private double valor;
    private int qtdEstoque;

    public Mercadoria(String nome, double valor, int qtdEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
    }

    public double comprar() {
        if (qtdEstoque > 0) {
            qtdEstoque--;
            return valor;
        } else {
            System.out.println("Estoque insuficiente.");
            return 0;
        }
    }

    public double comprar(int quantidade) {
        if (qtdEstoque >= quantidade) {
            qtdEstoque -= quantidade;
            return valor * quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
            return 0;
        }
    }

    public double comprar(int quantidade, double desconto) {
        if (qtdEstoque >= quantidade) {
            qtdEstoque -= quantidade;
            double total = valor * quantidade;
            return total - (total * (desconto / 100));
        } else {
            System.out.println("Estoque insuficiente.");
            return 0;
        }
    }
}
