package Logica;

public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private boolean estaTrabajando;

    @Override
    public String toString() {
        return "Empleado" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estaTrabajando=" + estaTrabajando +
                '}';
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstaTrabajando() {
        return estaTrabajando;
    }

    public void setEstaTrabajando(boolean estaTrabajando) {
        this.estaTrabajando = estaTrabajando;
    }

    public Empleado(int legajo, String nombre, String apellido, boolean estaTrabajando) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaTrabajando = estaTrabajando;
    }
}
