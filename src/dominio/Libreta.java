package dominio;
import java.util.ArrayList;
import java.util.List;

public class Libreta {
	private String nombre;
	private List<Contacto> contactos;
    

	public Libreta add(Contacto c){
		contactos.add(c);
		return this;
	}

	public Libreta borrarContacto(Contacto c){
		contactos.remove(c);
		return this;
	}

	public Libreta(String nombre) {
		this.nombre = nombre;
		contactos = new ArrayList<>();
	}
    
	public void agregarContacto(Contacto contacto) {
		this.contactos.add(contacto);
	}

	@Override
	public String toString() {
		String result = ("Libreta [nombre=]" + nombre + ", contactos=" + contactos + "]");
		return result;
	}

}
	
