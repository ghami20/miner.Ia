package Logica;

public class Camion {
    private  String numeroCamion;
    private double capacidadMax;
    private double capacidadActual;

    public String getNumeroCamion() {
        return numeroCamion;
    }

    public void setNumeroCamion(String numeroCamion) {
        this.numeroCamion = numeroCamion;
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

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    private Deposito deposito;

    public Camion(String numeroCamion, double capacidadMax, double capacidadActual, Deposito deposito) {
        this.numeroCamion = numeroCamion;
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
        this.deposito = deposito;
    }
}
