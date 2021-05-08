package datos;

public class Implemento extends Equipamento {
	private String marca;
	private String parte_cuerpo;
	private String material;
	
	
	public String getParte_cuerpo() {
		return parte_cuerpo;
	}

	public void setParte_cuerpo(String parte_cuerpo) {
		this.parte_cuerpo = parte_cuerpo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Implemento(String nombre, int precio, int id, Deporte segmento_deportivo, String tamano, String color,String marca, String parte_cuerpo, String material) {
		super(nombre, precio, id, segmento_deportivo, tamano, color);
		this.marca = marca;
		this.parte_cuerpo = parte_cuerpo;
		this.material = material;
	}
	

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id: "+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+"\n"+ "Marca: "+ getMarca()+"\n"+ "Parte del cuerpo: "+getParte_cuerpo()+"\n"+"Material: "+getMaterial(); 
	}

}
