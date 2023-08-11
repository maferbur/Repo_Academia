public class Persona {
    private final String nombre;
    private final int edad;
    private final Gender genero;

    public Persona(String nombre, int edad, Gender genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }//consructor

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Gender getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
