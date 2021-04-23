package datos;
//import datos.Indumentaria;

public class Accesorios extends Indumentaria{
	
	public Accesorios(String nombre, int precio, int id, String color, String talla, String genero) {
		super(nombre, precio, id, color, talla, genero);
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla();
	}
	
	
	
}
