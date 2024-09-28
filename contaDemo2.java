package listapoo.conta;

public class contaDemo2 {
    public static void main(String[] args) {
        
        contaEspecial contaEspecial = new contaEspecial("João", 1234, 100.0, 500.0);
        
        contaEspecial.depositarValor(400.0f);

        contaEspecial.retirarValor(50.0);

        System.out.println("Valor disponível: R$ " + contaEspecial.consultarValorDisponivel());

        contaEspecial.retirarValor(900.0);

        System.out.println("Valor disponível: R$ " + contaEspecial.consultarValorDisponivel());
        
        contaEspecial.retirarValor(100.0);

        contaEspecial.depositarValor(50.0f);

        System.out.println("Valor disponível: R$ " + contaEspecial.consultarValorDisponivel());

        contaEspecial.retirarValor(100.0);

        System.out.println("Valor disponível: R$ " + contaEspecial.consultarValorDisponivel());
    }
}