package Logica;

public class Encargado_deposito extends Empleado{
    private Deposito deposito;

    public Encargado_deposito(int legajo, String nombre, String apellido, boolean estaTrabajando, Deposito deposito) {
        super(legajo, nombre, apellido, estaTrabajando);
        this.deposito = deposito;
    }
}
