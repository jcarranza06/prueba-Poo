package datos;
//import datos.Indumentaria;

public class Accesorios extends Indumentaria{
	
	private String material;
	private String tipo;
	private String forma;
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public Accesorios(String nombre, int precio, int id, String color, String talla, String genero, String material, String tipo, String forma) {
		super(nombre, precio, id, color, talla, genero);
		this.material = material;
		this.tipo = tipo;
		this.forma = forma;
	}
	@Override
	public void ubicacion() {
		super.ubicacion();
		System.out.println("Propiamente, estoy en la parte central de la tienda :)");
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Color: "+ getColor()+"\n"+ "Talla: "+getTalla() +"\n" + "Material: " + getMaterial() + "\n" + "Tipo: " + getTipo() + "\n"+ "Forma: " + getForma();
	}
	
	
	
}
