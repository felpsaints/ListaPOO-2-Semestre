package listapoo.motor;

public class MotorDemo {
    public static void main(String[] args) {
        Motor[] motores = {
            new Motor("Motor 1", 200.0),
            new Motor("Motor 2", 700.0),
            new Motor("Motor 3", 2150.0),
            new Motor("Motor 4", 3000.0),
            new Motor("Motor 5", 3950.0)
        };

        motores[0].ligar();
        motores[1].ligar();
        motores[2].ligar();

        System.out.println("Motores desligados:");
        for (Motor motor : motores) {
            if (motor.isDesligado()) {
                System.out.println("Potência: " + motor.getPotencia());
            }
        }
    }
}
