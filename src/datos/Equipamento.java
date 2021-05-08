package datos;

public class Equipamento extends Producto{
	
	private Deporte segmento_deportivo;
	private String tamano;
	private String color;
	

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Deporte getSegmento_deportivo() {
		return segmento_deportivo;
	}

	public void setSegmento_deportivo(Deporte segmento_deportivo) {
		this.segmento_deportivo = segmento_deportivo;
	}
	public Equipamento(String nombre, int precio, int id, Deporte segmento_deportivo, String tamano, String color) {
		super(nombre, precio, id);
		this.segmento_deportivo = segmento_deportivo;
		this.tamano = tamano;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id"+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+ "\n"+ "Tamano: "+ getTamano()+"\n"+ "Color: " + getColor();
	}

}
