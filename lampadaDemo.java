
package listapoo.lampada;
public class lampadaDemo {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada("desligado", 400);

        lampada.ligar();
        lampada.desligar();

        System.out.println("Potência da lâmpada: " + lampada.getPotencia() + " watts");
    }
}
