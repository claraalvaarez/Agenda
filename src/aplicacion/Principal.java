package aplicacion;
import interfaz.Interfaz;

public class Principal {
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();

        interfaz.procesarEntrada("add clara 747392046");
        interfaz.procesarEntrada("add Paco 123456789");
        interfaz.procesarEntrada("list");
    }
}
