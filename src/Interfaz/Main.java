package Interfaz;
import Logica.*;

/*todos los pesos estan en kilos
   Precio ideal es por kilo
   precio ideal en pesos*/
public class Main {
    public static void main(String[] args) {
        //depositos
        Deposito deposito1=new Deposito(1000.0,0.0,"01");
        Deposito deposito2=new Deposito(1000.0,0.0,"02");

        //materiales
        Material oro = new Material("Oro", 100, 10000);
        Material hierro=new Material("Hierro",80.5,5000);
        Material cobre=new Material("Cobre",80.5,4000);
        Material plata=new Material("Plata",80.5,9000);
        Material litio=new Material("Litio",80.5,3000);

        //camiones
        Camion camion1= new Camion("001",100,0.0,deposito1);//capacidad no es muy util atm, ver si reemplazar con algo mas funcional.
        Camion camion2=new Camion("002",100,0,deposito1);
        Camion camion3=new Camion("003",100,0,deposito2);
        Camion camion4=new Camion("004",100,0,deposito2);

        //Empleados ->>>>Legajo auto incrementar, seguir formato. Esta trabajando no es util atm
        Camionero camionero1= new Camionero(0001,"Cesar","Rivero","1234",true,"958788",camion1);
        Camionero camionero2 = new Camionero(0002,"Ignacio","Armendariz","1234",false,"12345678",camion2);
        Camionero camionero3 = new Camionero(0003,"Maxi","Grippo","1234",false,"87654321",camion3);
        Camionero camionero4 = new Camionero(0004,"Gamaliel","Quiroz","1234",true,"56781234",camion4);

        Encargado encargado1=new Encargado(0005,"Chambi","Chambito","1234",true,deposito1);
        Encargado encargado2=new Encargado(0006,"Jano","Solo","1234",true, deposito2);
        Vendedor vendedor1=new Vendedor(0007,"Luis","Diaz","1234",false);
        Vendedor vendedor2=new Vendedor(0007,"Alejo","Nassif","1234",false);


        //camionero genera un informe del materrial que esta cargando
        camionero1.generarInforme(oro,30.0);
        camionero2.generarInforme(plata,20.0);
    //prueba lista de informes

    //ver lista de informes
        String acu="";
        for (InformeCarga informe:camionero1.verInformes()) {
            acu=acu+informe+"\n";
        }
        System.out.println(acu);

    //falta acomodar esto, lenar el deposito, puede ser pidiendo en generar informe donde se descargo el informe y actualizar la capacidad del deposito
        System.out.println(encargado1.revisarStock()
        );

        //probar crear clientes
        //segun la logica cacda vendeor tiene una lista de clientes
        //creo al cliente y lo guardo en lista de clientes
        vendedor1.crearCliente("StarX","3585895","144444444","Elon Musk");
        //muestro la lista de clientes
        String acum="";
        for (Cliente clientes:vendedor1.getClientes()
             ) {
            acum=acum+clientes+"\n";
        }
        System.out.println(acum);

    }
}