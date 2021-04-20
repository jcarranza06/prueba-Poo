package datos;

import java.util.List;

public class Carrito {
	private List<Producto> lista_productos;
	
	public List<Producto> getLista_productos(){
		return this.lista_productos;
	}
	public void setLista_productos(List<Producto> lista_productos) {
		this.lista_productos = lista_productos;
	}
	@Override
	public String toString() {
		return "Carrito [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
