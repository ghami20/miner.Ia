package Logica;

public class Deposito {
    private double capacidadMax;
    private double capacidadActual;

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

    private String numeroDeposito;

    public Deposito(double capacidadMax, double capacidadActual, String numeroDeposito) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
        this.numeroDeposito = numeroDeposito;
    }
}
