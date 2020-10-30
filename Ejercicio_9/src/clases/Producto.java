package clases;

public class Producto {

	private String nombre;
	private String identificacion;
	private double precioBase;
	
	
	public Producto() {}
	
	public Producto(String nombre, String identificacion, double precioBase) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.precioBase = precioBase;
	}
	
			
	public String getNombre() {
			return nombre;
		}
			
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	@Override
	public String toString() {
		
		return identificacion + "(" + precioBase + ")" ;
	
	}
	
	
	
	
	
	  
	
	
	
	
	
	
}
