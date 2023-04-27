package Logica;

public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private boolean estaTrabajando;
    private String clave;



    public boolean login(int legajo,String clave){
        if (this.legajo==legajo&&this.clave==clave)
        {return true;}else {return false;}

    }
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

    public Empleado(int legajo, String nombre, String apellido,String clave, boolean estaTrabajando) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaTrabajando = estaTrabajando;
        this.clave=clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean login(String clave) {
        
        if(clave.equals(this.getClave())) {
            return true;
                }else {
                    return false;
                            }

} 

}
