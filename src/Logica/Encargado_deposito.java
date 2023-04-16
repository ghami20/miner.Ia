package Logica;

public class Encargado_deposito extends Empleado{
    private Deposito deposito;

    public Encargado_deposito(int legajo, String nombre, String apellido,String clave, boolean estaTrabajando, Deposito deposito) {
        super(legajo, nombre, apellido, clave,estaTrabajando);
        this.deposito = deposito;
    }
}
