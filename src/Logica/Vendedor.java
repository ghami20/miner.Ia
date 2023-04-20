package Logica;

import java.util.ArrayList;

public class Vendedor extends Empleado{

    private ArrayList<Cliente>Clientes = new ArrayList<Cliente>();

    public Vendedor(int legajo, String nombre, String apellido, String clave,boolean estaTrabajando) {
        super(legajo, nombre, apellido,clave, estaTrabajando);
    }

    public ArrayList<Cliente> crearCliente(String nombre,String cuit,String telefono,String responsable){
        getClientes().add(new Cliente(nombre,cuit,telefono,responsable));
        return Clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        Clientes = clientes;
    }
}
