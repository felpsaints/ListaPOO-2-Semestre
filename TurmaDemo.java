package listapoo.turma;

public class TurmaDemo {
    public static void main(String[] args) {
        String[] alunos = {
            "Ana", "Bruno", "Carlos", "Diana", "Eduardo",
            "Fernanda", "Gabriel", "Helena", "Igor", "Julia"
        };
        
        float[] notas = {8.5f, 7.0f, 9.5f, 6.5f, 10.0f,
                         7.5f, 8.0f, 5.0f, 9.0f, 8.0f};

        Turma turma = new Turma(alunos, notas);
        
        System.out.println("Média das notas: " + turma.calcularMediaNota());
        System.out.println("Alunos e suas notas:");
        turma.imprimirAlunos();
    }
}
