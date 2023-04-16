package Logica;

import java.util.ArrayList;

public class Camionero extends Empleado{
    private String licencia;
    private Camion camion;

    public InformaCarga generarInforme(Material material, Double cantidad){
        return new InformaCarga(material,cantidad) ;
    }
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Camionero(int legajo, String nombre, String apellido, boolean estaTrabajando, String licencia, Camion camion) {
        super(legajo, nombre, apellido, estaTrabajando);
        this.licencia = licencia;
        this.camion = camion;
    }
}
