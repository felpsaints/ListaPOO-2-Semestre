package listapoo.produto;

public class Produto {
    private String descricao;
    private double preco;
    private int saldo;

    public Produto(String descricao, double preco, int saldo) {
        this.descricao = descricao;
        this.preco = preco;
        this.saldo = saldo;
    }


    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getSaldo() {
        return saldo;
    }
}
