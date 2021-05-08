package datos;

public class Tren_superior extends Indumentaria{
	
	private String horma;
	private boolean diseno_solido;
	private String mangas;
	
	
	public String getHorma() {
		return horma;
	}

	public void setHorma(String horma) {
		this.horma = horma;
	}

	public boolean isDiseno_solido() {
		return diseno_solido;
	}

	public void setDiseno_solido(boolean diseno_solido) {
		this.diseno_solido = diseno_solido;
	}

	public String getMangas() {
		return mangas;
	}

	public void setMangas(String mangas) {
		this.mangas = mangas;
	}

	public Tren_superior(String nombre, int precio, int id, String color, String talla,String genero, String horma, boolean diseno_solido, String mangas) {
		super(nombre, precio, id,  color, talla, genero);
		this.horma = horma;
		this.diseno_solido = diseno_solido;
		this.mangas = mangas;
	}
	@Override
	public void ubicacion() {
		super.ubicacion();
		System.out.println("Ya adentro, estoy en el segundo piso en el costado derecho :0");
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla()+"\n"+ "Genero: "+ getGenero()+"\n"+"Horma: "+ getHorma()+ "\n" + "Diseño solido: "+ isDiseno_solido() + "\n"+ "Mangas: "+ getMangas();
	}

}
