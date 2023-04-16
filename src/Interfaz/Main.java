package Interfaz;

import Logica.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Deposito d1=new Deposito(100000.0,0.0,"1");
        Material m1 = new Material("Oro", 100, 1000);
        Material m2=new Material("Hierro",80.5,750.0);
        Camion camion1= new Camion("1",10000.0,0.0,d1);
        Camionero c1= new Camionero(1,"Cesar","Rivero","1234",true,"958788",camion1);
        //camionero genera un informe del materrial que esta cargando
        c1.generarInforme(m1,10.5);
        c1.generarInforme(m2,20.0);
//prueba lista de informes
        System.out.println(c1.getListaDeInformes().get(1).getMaterial().getNombre());





    }
}