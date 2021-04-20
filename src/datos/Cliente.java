package datos;

public class Cliente {
	private Carrito carrito;
	private String nombre;
	private int id;
	
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cliente [carrito=" + carrito + ", nombre=" + nombre + ", id=" + id + ", getCarrito()=" + getCarrito()
				+ ", getNombre()=" + getNombre() + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
