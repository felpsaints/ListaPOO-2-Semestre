package listapoo.refrigerante;

public class RefrigeranteDemo {
    public static void main(String[] args) {
        Refrigerante[] refrigerantes = {
            new Refrigerante("Cocacola", 1.50, 40),
            new Refrigerante("Fanta Uva", 0.90, 10),
            new Refrigerante("Fanta Laranja", 0.90, 8),
            new Refrigerante("Sprite", 0.80, 20),
            new Refrigerante("Kuat", 1.00, 100)
        };

        double valorPago = 5.00;

        int quantidadeVenda1 = 2;
        if (refrigerantes[0].efetuarVenda(quantidadeVenda1)) {
            double troco1 = valorPago - (quantidadeVenda1 * refrigerantes[0].getPreco());
            System.out.println("Venda 1: " + refrigerantes[0].getNome() + " - Saldo restante: " +
                               refrigerantes[0].getQtdEstoque() + ", Troco: R$ " + troco1);
        }

        int quantidadeVenda2 = 3;
        if (refrigerantes[3].efetuarVenda(quantidadeVenda2)) {
            double troco2 = valorPago - (quantidadeVenda2 * refrigerantes[3].getPreco());
            System.out.println("Venda 2: " + refrigerantes[3].getNome() + " - Saldo restante: " +
                               refrigerantes[3].getQtdEstoque() + ", Troco: R$ " + troco2);
        }
    }
}
