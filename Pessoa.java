package listapoo.pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String toString() {
        double imc = calcularIMC();
        String categoria;
        if (imc <= 18.5) {
            categoria = "Abaixo do peso normal";
        } else if (imc <= 25) {
            categoria = "Peso Normal";
        } else if (imc <= 30) {
            categoria = "Acima do peso normal";
        } else {
            categoria = "Obesidade";
        }
        return nome + ": " + categoria;
    }
}
