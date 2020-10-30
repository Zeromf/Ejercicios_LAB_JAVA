import clases.Producto;
import clases.ProductoStock;
import clases.Tienda;

public class TestTienda {

	public static void main(String[] args) {
		
		//Producto p1=new Producto();
		
	//	p1.setIdentificacion("AB123");
	//	p1.setPrecioBase(10.50);
		
		
		//System.out.print(p1.toString());
		
		//*****************************************************************
	
		ProductoStock p1= new ProductoStock ();
		
		p1.setPrecioBase(10.50);

		p1.setCantidad(10);
		p1.setBeneficio(13);
		p1.setNombre("Producto 1");
		p1.setIdentificacion("AB123");
		
		System.out.println("El precio final del producto es: "+p1.precioFinal());	

		
		System.out.println("El precio final del producto es: "+p1.toString());	

		System.out.println(" ");	
		System.out.println("**************Producto 2************************");	
		System.out.println(" ");	
		ProductoStock p2= new ProductoStock ();
		
		p2.setPrecioBase(60);

		p2.setCantidad(2);
		p2.setBeneficio(50);
		p2.setNombre("Leche");
		p2.setIdentificacion("AB0568");
		
		System.out.println("El precio final del producto es: "+p2.precioFinal());	

		
		System.out.println("El precio final del producto es: "+p2.toString());	

	
		System.out.println(" ");	
		System.out.println("**************Producto 3************************");	
		System.out.println(" ");
		ProductoStock p3= new ProductoStock ();
		
		p3.setPrecioBase(80);

		p3.setCantidad(1);
		p3.setBeneficio(30);
		p3.setNombre("Harina");
		p3.setIdentificacion("AB8906");
		
		System.out.println("El precio final del producto es: "+p3.precioFinal());	

		
		System.out.println("El precio final del producto es: "+p3.toString());	
		
		
		System.out.println(" ");	
		System.out.println("**************Producto 4************************");	
		System.out.println(" ");
		ProductoStock p4= new ProductoStock ();
		
		p4.setPrecioBase(70);

		p4.setCantidad(2);
		p4.setBeneficio(0);
		p4.setNombre("Yerba");
		p4.setIdentificacion("AB00000");
		
		System.out.println("El precio final del producto es: "+p4.precioFinal());	

		
		System.out.println("El precio final del producto es: "+p4.toString());	
		
		
		
		
		
		Tienda tienda=new Tienda();
		
		tienda.agregarProducto(p1);

	}

}
