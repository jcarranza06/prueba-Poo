package datos;

public class Deporte {
	private String nombre;
	private String categoria;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public Deporte(String nombre, String categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Deporte [nombre=" + nombre + ", categoria=" + categoria + ", getNombre()=" + getNombre()
				+ ", getCategoria()=" + getCategoria() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
