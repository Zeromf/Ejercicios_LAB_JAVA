package clases;

public class ProductoStock extends Producto{
	
	private int Cantidad;
	private int beneficio;
	
	
	
	public ProductoStock(){}
	
	
	public ProductoStock(String nombre, String identificacion, double precioBase,int cantidad, int beneficio) {
		super(nombre,identificacion,precioBase);
		Cantidad = cantidad;
		this.beneficio = beneficio;
	}
	
	
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	public int getBeneficio() {
		return beneficio;
	}
	
	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}
	
	
	public double precioFinal(){
		//Guardo en el contador el descuento
		double preciodescuento=0;
		
		
		double precioFinal=getPrecioBase() * Cantidad;
		
		double porcentaje= beneficio*0.01;
		
		preciodescuento=precioFinal*porcentaje;
		
		precioFinal=precioFinal-preciodescuento;
		
		
		return precioFinal;
		
		
	}

	

	@Override
	public String toString() {
		return getNombre()+" - "+getCantidad()+" "+ super.toString()+"("+"+"+getBeneficio()+"%"+")";
	}
	
	
	
	
	
		
}
