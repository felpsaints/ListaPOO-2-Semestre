package listapoo.motor;

public class Motor {
    String nome;
    double potencia;
    boolean ligado;

    public Motor(String nome, double potencia) {
        this.nome = nome;
        this.potencia = potencia;
        this.ligado = false; 
    }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " desligado.");
    }

    public boolean isDesligado() {
        return !ligado;
    }

    public double getPotencia() {
        return potencia;
    }
}
