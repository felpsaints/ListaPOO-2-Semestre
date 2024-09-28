package listapoo.calculadora;

public class CalculadoraDemo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double soma = calculadora.somar(10, 5);
        double subtracao = calculadora.subtrair(10, 5);
        double multiplicacao = calculadora.multiplicar(10, 5);
        double divisao = calculadora.dividir(10, 0);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}
