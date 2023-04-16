package Logica;

public class Material {
    private String nombre;
    private double pureza;
    private double precioIdeal;


    public Material(String nombre, double pureza, double precioIdeal) {
        this.nombre = nombre;
        this.pureza = pureza;
        this.precioIdeal = precioIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPureza() {
        return pureza;
    }

    public void setPureza(double pureza) {
        this.pureza = pureza;
    }

    public double getPrecioIdeal() {
        return precioIdeal;
    }

    public void setPrecioIdeal(double precioIdeal) {
        this.precioIdeal = precioIdeal;
    }
}
