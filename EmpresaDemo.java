package listapoo.empresa;

public class EmpresaDemo {
    public static void main(String[] args) {
        Empresa[] empresas = {
            new Empresa("Empresa A", 50000.0, 10),
            new Empresa("Empresa B", 70000.0, 5),
            new Empresa("Empresa C", 60000.0, 15),
            new Empresa("Empresa D", 80000.0, 8),
            new Empresa("Empresa E", 90000.0, 12)
        };

        Empresa menorFuncionarios = empresas[0];
        Empresa maiorCapital = empresas[0];

        for (Empresa empresa : empresas) {
            if (empresa.getNFuncionarios() < menorFuncionarios.getNFuncionarios()) {
                menorFuncionarios = empresa;
            }
            if (empresa.getCapital() > maiorCapital.getCapital()) {
                maiorCapital = empresa;
            }
        }

        System.out.println("Menor número de funcionários: " + menorFuncionarios.getNome());
        System.out.println("Maior capital: " + maiorCapital.getNome());
    }
}
