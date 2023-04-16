package Interfaz;

import Logica.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Deposito d1=new Deposito(100000.0,0.0,"1");
        Material m1 = new Material("Oro", 100, 1000);
        Camion camion1= new Camion("1",10000.0,0.0,d1);
        Camionero c1= new Camionero(1,"Cesar","Rivero",true,"125412",camion1);
        c1.generarInforme(m1,10.5);



    }
}