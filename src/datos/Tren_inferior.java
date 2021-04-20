 package datos;

public class Tren_inferior extends Indumentaria {
	public Tren_inferior(String nombre, int precio, int id, String color, String talla,String genero) {
		super(nombre, precio, id,  color, talla, genero);
	}

	@Override
	public String toString() {
		return "Tren_inferior [getColor()=" + getColor() + ", getTalla()=" + getTalla() + ", getGenero()=" + getGenero()
				+ ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
