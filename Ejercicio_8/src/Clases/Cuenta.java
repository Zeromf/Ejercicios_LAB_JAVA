package Clases;

public class Cuenta {

	private double Saldo=0;
	private int nroCuenta;
	private double SaldoDescubierto;

	private String titular;
	private String cuentaHabilitada;
	private String tipoCuenta;
	
	public Cuenta() {}

	/*public Cuenta(double saldo, int nroCuenta, String titular, String cuentaHabilitada, String tipoCuenta,double SaldoDescubierto) {
		super();
		Saldo = saldo;
		this.nroCuenta = nroCuenta;
		this.titular = titular;
		this.cuentaHabilitada = cuentaHabilitada;
		this.tipoCuenta = tipoCuenta;
		this.SaldoDescubierto=SaldoDescubierto;
	}*/

	
	

	public Cuenta(String nombre, String tipo, int nro, double saldo, double saldoDes, String cuentaHabilitada) {
		super();
		Saldo = saldo;
		this.nroCuenta = nro;
		this.titular = nombre;
		this.cuentaHabilitada = cuentaHabilitada;
		this.tipoCuenta = tipo;
		this.SaldoDescubierto=saldoDes;	}

	public double getSaldo(){
		return Saldo;
			
	}
    
	public void setSaldo(double Saldo){
		this.Saldo=Saldo;;
			
	}
	
	
	public String getNombre(){
		return titular;
			
	}
    
	public void setNombre(String nombre){
		this.titular=nombre;;
			
	}
	
	
	
	
	
    
	
	
	public void retirar(int importe) {
	
	if (cuentaHabilitada.equals("Si")) {	
		double suma=Saldo+SaldoDescubierto;
		
		if (suma>=importe) {
			System.out.println("El monto a retirar es: "+importe);
			Saldo=Saldo-importe;
			if (Saldo>=0) {
				System.out.println("El Saldo es: "+Saldo);

			}
			
			if (Saldo<importe) {
				System.out.println("Se debe utilizar dinero del Saldo en descubierto: ");
				System.out.println("Le debe al banco: "+Math.abs(Saldo));

			}
		}else {
			
			System.out.println("No es posible retirar el dinero");
			
		}
		
		
	
	}else
		if (cuentaHabilitada.equals("No")) {
    		System.out.print("La cuenta esta desabilitada ingrese otra");
        }
	
	}
	

	
	public void depositar(double importe) {
		
		if (cuentaHabilitada.equals("Si")) {
			Saldo=Saldo+importe;
	
	    }else{

	    	if (cuentaHabilitada.equals("No")) {
	    		System.out.print("La cuenta esta desabilitada ingrese otra");
	        }
	    	
	    }
		
		
	}
	
	
	
	
	
	
	public boolean Transferencia(Cuenta c,int importe) {
		boolean correcto=true;
	if (cuentaHabilitada.equals("Si")) {	
		
		
		if (importe<0) {
			correcto=false;
		}else
			if(Saldo>=importe) {

				c.depositar(importe);
				Saldo=Saldo-importe;
				if(c.tipoCuenta.equals("Caja ahorro")) {

			    	double porcentaje=0;
			    	porcentaje=Saldo*0.015; 

			    	Saldo=Saldo-porcentaje;
			    	

				}else {
					
					if(c.tipoCuenta.equals("Caja corriente")) {

				    	double porcentaje=0;
				    	porcentaje=Saldo*0.03; 

				    	Saldo=Saldo-porcentaje;
					
			//		System.out.println(Saldo);
					
					
					
					}
				}
				

		}else {
			correcto=false;
			
		}
		
	
		
	}else
		if (cuentaHabilitada.equals("No")) {
    		System.out.print("La cuenta esta desabilitada ingrese otra");
        }
	
	return correcto;
	

	}
	
    /*método reintegro
    public boolean reintegro(double importe) {
        boolean reintegroCorrecto = true;                                                                         
        if (importe < 0) {
            reintegroCorrecto = false;
        } else if (Saldo >= importe) {
            Saldo -= importe;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }*/
	
	
	

	@Override
	public String toString() {
		return "Cuenta [Saldo=" + Saldo + ", nroCuenta=" + nroCuenta + ", SaldoDescubierto=" + SaldoDescubierto
				+ ", titular=" + titular + ", cuentaHabilitada=" + cuentaHabilitada + ", tipoCuenta=" + tipoCuenta
				+ "]";
	}
	
	
	
	
	
	
	

	
	
}
