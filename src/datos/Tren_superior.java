package datos;

public class Tren_superior extends Indumentaria{
	public Tren_superior(String nombre, int precio, int id, String color, String talla,String genero) {
		super(nombre, precio, id,  color, talla, genero);
	}

	@Override
	public String toString() {
		return "Tren_superior [getColor()=" + getColor() + ", getTalla()=" + getTalla() + ", getGenero()=" + getGenero()
				+ ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getPrecio()=" + getPrecio()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
