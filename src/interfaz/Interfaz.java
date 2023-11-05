package interfaz;
import java.util.ArrayList;
import java.util.List;
import dominio.Contacto;

public class Interfaz {
    private List<Contacto> agenda;

    public Interfaz() {
        agenda = new ArrayList<> ();
    }

    
    public void procesarEntrada(String entrada){
        String[] partes = entrada.split(" ");
        if (partes.length == 0) {
            System.out.println("Entrada no valida");
            return;
        }
        String comando = partes[0].toLowerCase();
        if (comando.equals("add") && partes.length >= 3) {
            String nombre = partes[1];
            String telefono = partes [2];
            agregarContacto(nombre, telefono);
        } else if (comando.equals("list")) {
            listarContactos();
        }else{
            System.out.println("Comando no reconocido");
        }

    }

    private void agregarContacto (String nombre, String telefono) {
        Contacto contacto = new Contacto(nombre, telefono);
        agenda.add(contacto);
        System.out.println("Contacto añadido: " + nombre + " - " + telefono);
    }
    
    private void listarContactos() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda de contactos esta vacia. ");
        } else {
            System.out.println("Lista de contactos: ");
            for (Contacto contacto : agenda) {
                System.out.println(contacto.getNombre() + " - " + contacto.getTelefono());
            }
        }

    }
    public static void main(String[]args){
        Interfaz interfaz = new Interfaz();
        interfaz.procesarEntrada("add Clara 747392046");
        interfaz.procesarEntrada("add Paco 123456789");
        interfaz.procesarEntrada("list");

    }
    
}
