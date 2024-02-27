public class Familiar extends Contacto {

    private String parentezco;

    public Familiar(int telefono, Persona person, String parentezco) {
        super(telefono, person);
        this.parentezco = parentezco;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

}
