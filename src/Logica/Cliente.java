package Logica;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String cuit;
    private String telefono;
    private String responsable;

    public Cliente(String nombre, String cuit, String telefono, String responsable) {
        Nombre = nombre;
        this.cuit = cuit;
        this.telefono = telefono;
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", cuit='" + cuit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", responsable='" + responsable + '\'' +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
