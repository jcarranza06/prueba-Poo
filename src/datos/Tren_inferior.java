 package datos;

public class Tren_inferior extends Indumentaria {
	public Tren_inferior(String nombre, int precio, int id, String color, String talla,String genero) {
		super(nombre, precio, id,  color, talla, genero);
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla()+"\n"+ "Genero: "+ getGenero();
	}
	
}
