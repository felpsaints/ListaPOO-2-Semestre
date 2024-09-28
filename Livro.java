package listapoo.livro;

public class Livro {
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public static void main(String[] args) {
        Livro[] livros = new Livro[4];
        livros[0] = new Livro("Livro A", 3460);
        livros[1] = new Livro("Livro B", 1250);
        livros[2] = new Livro("Livro C", 10);
        livros[3] = new Livro("Livro D", 2);
    }
}
