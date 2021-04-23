package datos;

public class Indumentaria extends Producto {
	private String color;
	private String talla;
	private String genero;
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Indumentaria(String nombre, int precio, int id, String color, String talla, String genero) {
		super(nombre,precio,id);
		this.color = color;
		this.talla = talla;
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla()+"\n"+ "Genero: "+ getGenero();
	}

}
