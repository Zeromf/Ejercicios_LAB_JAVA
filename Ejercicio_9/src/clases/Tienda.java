package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tienda {

	private String nombre;
	
	private int maxProductos =0;
	
	
	private ArrayList<ProductoStock> inventario = new ArrayList();

	private int ultimaEntrada;
	
	private int Caja;

	public Tienda(String nombre, int maxProductos, int caja) {
		super();
		this.nombre = nombre;
		this.maxProductos = maxProductos;
		Caja = caja;
	}
	
	public Tienda() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public Producto buscarProducto(String id) {
		for(Producto ps: inventario ) {
			if (ps.getIdentificacion().equals(id)) {
				return ps;
			}
	
	}
		return null;

	}


	public void agregarProducto(ProductoStock producto) {
		boolean stock=true;
		
		for (int i = 0; i < inventario.size(); i++) {
			if (inventario.get(i).equals(producto)) {
				stock= false;
			}else {
				
				inventario.add(producto);
				
				
			}
			
		}
		
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
