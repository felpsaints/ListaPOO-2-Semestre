package listapoo.turma;

public class Turma {
    private String[] alunos;
    private float[] notas;

    public Turma(String[] alunos, float[] notas) {
        this.alunos = alunos;
        this.notas = notas;
    }

    public float calcularMediaNota() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void imprimirAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i] + ": " + notas[i]);
        }
    }
}
