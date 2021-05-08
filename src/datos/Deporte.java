package datos;

public class Deporte {
	private String nombre;
	private String categoria;
	private String individual_equipo;
	
	
	
	public String getIndividual_equipo() {
		return individual_equipo;
	}
	public void setIndividual_equipo(String individual_equipo) {
		this.individual_equipo = individual_equipo;
	}
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
		return "Nombre: " + getNombre()+ "Categoria: "+ getCategoria()+"\n"+"Individual o equipo: " + getIndividual_equipo();
	}

}
