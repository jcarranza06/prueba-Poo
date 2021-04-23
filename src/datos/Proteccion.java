package datos;

public class Proteccion extends Equipamento {
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public Proteccion(String nombre, int precio, int id, String material, Deporte segmento_deportivo) {
		super(nombre, precio, id, segmento_deportivo);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id"+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+"\n"+ "Material: " + getMaterial();
		
	}
}
