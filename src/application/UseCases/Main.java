import domain.Empresa;

package application.UseCases;
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.listarEmpleados();

    }
}