package datos;

public class producto {
	private String nombre;
	private int precio;
	private int id;
	
	public producto(String nombre, int precio, int id) {
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	@Override
	public String toString() {
		return "producto [nombre=" + nombre + ", precio=" + precio + ", id=" + id + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

