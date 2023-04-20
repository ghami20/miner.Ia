package Logica;

import java.util.ArrayList;

public class Deposito {
    private double capacidadMax;
    private double capacidadActual;
    private String numeroDeposito;
    private ArrayList<Material>materiales =new ArrayList<Material>();

    public Deposito(double capacidadMax, double capacidadActual, String numeroDeposito) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
        this.numeroDeposito = numeroDeposito;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getNumeroDeposito() {
        return numeroDeposito;
    }

    public void setNumeroDeposito(String numeroDeposito) {
        this.numeroDeposito = numeroDeposito;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Material> materiales) {
        this.materiales = materiales;
    }
}
