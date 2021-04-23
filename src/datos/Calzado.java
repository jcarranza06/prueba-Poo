package datos;

public class Calzado extends Indumentaria{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Calzado(String nombre, int precio, int id, String color, String talla, String genero, String tipo) {
		super(nombre, precio, id, color, talla, genero);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla()+"\n"+ "Genero: "+ getGenero()+"\n"+"Tipo: "+ getTipo();
	}

}
