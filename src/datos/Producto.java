package datos;

public class Producto {
	private final String nombre;
	private int precio;
	private int id;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Producto(String nombre, int precio, int id) {
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId();
	}
}

