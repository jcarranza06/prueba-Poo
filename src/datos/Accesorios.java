package datos;
//import datos.Indumentaria;

public class Accesorios extends Indumentaria{
	
	public Accesorios(String nombre, int precio, int id, String color, String talla, String genero) {
		super(nombre, precio, id, color, talla, genero);
	}

	@Override
	public String toString() {
		return " + getColor() + " + getTalla() +" + getTalla() + " + getGenero() +" + getGenero() "+
				", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
