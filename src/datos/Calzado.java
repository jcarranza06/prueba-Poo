package datos;

public class Calzado extends Indumentaria{
	private String tipo;
	private String marca;
	private String calidad;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Calzado(String nombre, int precio, int id, String color, String talla, String genero, String tipo, String calidad, String marca) {
		super(nombre, precio, id, color, talla, genero);
		this.tipo = tipo;
		this.marca = marca;
		this.calidad = calidad;
	}
	@Override
	public void ubicacion() {
		System.out.println("Ya en la tienda, me puedes encontrar en el primer piso en el costado derecho :p");
	}
	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla()+"\n"+ "Genero: "+ getGenero()+"\n"+"Tipo: "+ getTipo() +"\n" +"Marca: " + getMarca()+ "\n"+ "Calidad:"+ getCalidad();
	}

}
