public class Persona {

    private String nombre;
    private int edad;
    private int cedula;

//----------------------------Constructor---------------------------------/
    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

//---------------------------Getters--------------------------------------/
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

//---------------------------Setters--------------------------------------/
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
