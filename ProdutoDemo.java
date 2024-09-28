package listapoo.produto;

import java.util.Scanner;

public class ProdutoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Notebook", 3500.00, 10);
        produtos[1] = new Produto("Smartphone", 1500.00, 20);
        produtos[2] = new Produto("TV", 2500.00, 5);
        produtos[3] = new Produto("Tablet", 800.00, 15);
        produtos[4] = new Produto("Impressora", 600.00, 7);

        String nomeProduto;

        while (true) {
            System.out.println("Informe o produto ou digite fim para terminar: ");
            nomeProduto = scanner.nextLine();

            if (nomeProduto.equalsIgnoreCase("fim")) {
                System.out.println("Encerrando");
                break;
            }

            boolean encontrado = false;
            for (Produto produto : produtos) {
                if (produto.getDescricao().equalsIgnoreCase(nomeProduto)) {
                    System.out.println("Preço: R$ " + produto.getPreco());
                    System.out.println("Saldo: " + produto.getSaldo() + " unidades");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Produto inexistente no catálogo.");
            }
        }

        scanner.close();
    }
}
