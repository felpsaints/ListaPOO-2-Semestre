package listapoo.lampada;

public class Lampada {
    private int potencia; 
    private String estado;

    public Lampada() {
        this.estado = "desligado";
    }

    public Lampada(String estado, int potencia) {
        this.estado = estado;
        this.potencia = potencia;
    }
    
    public void ligar() {
        estado = "ligado";
    }
    public void desligar() {
        estado = "desligado";
    }
    public int getPotencia() {
        return potencia;
    }
    public String getEstado() {
        return estado;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
