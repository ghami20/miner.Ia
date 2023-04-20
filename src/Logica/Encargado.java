package Logica;

import java.util.ArrayList;

public class Encargado extends Empleado{
    private Deposito deposito;

    public ArrayList<Material> revisarStock(){
        return this.getDeposito().getMateriales();

    }
    public Encargado(int legajo, String nombre, String apellido, String clave, boolean estaTrabajando, Deposito deposito) {
        super(legajo, nombre, apellido, clave,estaTrabajando);
        this.deposito = deposito;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }
}
