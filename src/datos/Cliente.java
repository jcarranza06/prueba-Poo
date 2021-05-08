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
	public Cliente(Carrito carrito, String nombre, int id) {
		this.carrito = carrito;
		this.id = id;
		this.nombre = nombre;
		
	}
	public final void saludo() {
		System.out.println("Saludos :3 tengo la plata que tu quieres");
	}
	@Override
	public String toString() {
		return "Nombre: "+ getNombre() +"\n"+ "id: "+ getId() +"\n"+ "Carrito: "+ getCarrito();
	}
}
