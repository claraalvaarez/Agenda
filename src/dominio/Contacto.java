
package dominio;
public class Contacto{
        private String nombre;
        private String numeroDeTelefono;

        public Contacto(String n, String t){
                nombre = n;
                numeroDeTelefono = t;
        }

        public String getNombre(){
                return nombre;
        }

        public void setNombre(String n){
                nombre = n;
        }

        public String getNumeroDeTelefono(){
                return numeroDeTelefono;
        }
        public void setNumeroDeTelefono(String t){
                numeroDeTelefono = t;
        }
        public String toString() {
            String result = (" Nombre del contacto " + nombre + " Numero de telefono " + numeroDeTelefono);
            return result;
        }

        public void add(Contacto contacto) {
        }

        public String getTelefono() {
                return null;
        }
    }
