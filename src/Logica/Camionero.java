package Logica;

import java.util.ArrayList;

public class Camionero extends Empleado{
    private String licencia;
    private Camion camion;
    private ArrayList<InformeCarga>listaDeInformes = new ArrayList<InformeCarga>() ;

    public ArrayList<InformeCarga> generarInforme(Material material, Double cantidad){

        listaDeInformes.add(new InformeCarga(material,cantidad));
        return listaDeInformes ;
    }

    public ArrayList<InformeCarga> verInformes(){

        return this.getListaDeInformes();

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

    public Camionero(int legajo, String nombre, String apellido,String clave, boolean estaTrabajando, String licencia, Camion camion) {
        super(legajo, nombre, apellido, clave,estaTrabajando);
        this.licencia = licencia;
        this.camion = camion;
    }

    public ArrayList<InformeCarga> getListaDeInformes() {
        return listaDeInformes;
    }

    public void setListaDeInformes(ArrayList<InformeCarga> listaDeInformes) {
        this.listaDeInformes = listaDeInformes;
    }
}
