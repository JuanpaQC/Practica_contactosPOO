public class Contacto {

    private int telefono;

    private Persona person;

    public Contacto(int telefono, Persona person) {
        this.person = person;
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}
