package datos;

import java.util.ArrayList;
import java.util.List;

public final class Carrito {
	private List<Producto> lista_productos;
	private int cantidad;
	private Cliente cliente;
	
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Producto> getLista_productos(){
		return this.lista_productos;
	}
	public void setLista_productos(List<Producto> lista_productos) {
		this.lista_productos = lista_productos;
	}
	public void addItem(Producto producto) {
		this.lista_productos.add(producto);
	}
	
	public Carrito(int cantidad, Cliente cliente) {
		this.lista_productos = new ArrayList<Producto>();
		this.cantidad = cantidad;
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Carrito: " + getLista_productos() +"\n \n" + "Cantidad: " + getCantidad()+ "\n \n" + "Cliente: "+ getCliente();
	}
}
