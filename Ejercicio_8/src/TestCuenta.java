import java.util.Scanner;

import Clases.Cuenta;

public class TestCuenta {
       public static void main(String[] args) {
    
    	   Scanner n=new Scanner(System.in);
    	   
    	   /*guia de porcentaje	
    	   double sueldo=1000;
    	double porcentaje=sueldo*0.1; 
    	sueldo=sueldo-porcentaje;
    	*/

    
    	   
    	   /*  	   
       Cuenta c1=new Cuenta(20000,01,"Enzo","No","Caja corriente",50000);
    	   
     Cuenta c2=new Cuenta(50000,02,"Marcelo","No","Caja ahorro",200000);

    	   
    	  
          // Consultamos el saldo de la cuenta
 		
    	  double total=c1.getSaldo();
	 		System.out.println("Total actual en la cuenta: "+total+ " $");

    	  
	 		  // Deposito dinero
		 		
	    	  System.out.println("Ingreso a la cuenta : "+10000);
	    	  c1.depositar(10000);
	    	  System.out.println("Total actual en la cuenta: "+c1.getSaldo()+ " $");
		
	 		  // Retiro dinero

			//	c1.retirar(10000);
		 		
	    	  
	    	  // Tranferencia de dinero
	    	  c2.Transferencia(c1, 30000);
	    	  
	    	  System.out.println("Total actual : "+c1.getSaldo()+ " $");
    	*/
    	       	   
 
    	   System.out.println("Ingrese el nombre del titular: ");
    	   
    	   String nombre=n.nextLine();
  

    	   System.out.println("Ingrese el tipo de cuenta: Caja Corriente o Caja Ahorro");

    	   String tipo =n.nextLine();

    	   
    	   System.out.println("Ingrese el numero de cuenta: ");
    	   int nro=n.nextInt();
    	   
    	   System.out.println("Ingrese el saldo de su cuenta: ");
    	   double saldo=n.nextInt();
    	   
    	   System.out.println("Ingrese el saldo descubierto que le da el banco: ");
    	   double saldoDes=n.nextInt();
    	  
    	   Cuenta cuenta1=new Cuenta(nombre,tipo,nro,saldo,saldoDes,"Si");//Cuenta 1
    	  
    	   System.out.println("Cuanto desea depositar: ");
    	   double deposito=n.nextInt();

    	   cuenta1.depositar(deposito); // ingresar dinero
    	   System.out.println("transición exitosa......");
    	   
    	   System.out.println(cuenta1.toString());
    	   
    	   System.out.println("Cuanto desea retirar: ");
    	   int r=n.nextInt();
    	   
    	   cuenta1.retirar(r);
    	   System.out.println(cuenta1.toString());
    	   System.out.println("transición exitosa......");
    	   
    	   
    	   
    	   
    	   
           Cuenta cuenta2=new Cuenta("Marcelo","Caja Ahorro",001,20000,50000,"Si");
           System.out.println("Cuanto dinero desea prestar: ");
    	   int p=n.nextInt();

    	   cuenta1.Transferencia(cuenta2, p);
    	   
    	   
    	   System.out.println("El saldo de la cuenta de: "+cuenta1.getNombre()+" es: "+cuenta1.getSaldo());
    	   System.out.println("");

    	   System.out.println("El saldo de la cuenta de: "+cuenta2.getNombre()+" es: "+cuenta2.getSaldo());

    	   
    	   
    	   
    	   
    	   
    	   

    	   
	}
}