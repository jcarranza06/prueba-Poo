package datos;

public class Proteccion extends Equipamento {
	private String material;
	private String parte_cuerpo;
	private String nivel_proteccion;
	
	
	public String getParte_cuerpo() {
		return parte_cuerpo;
	}

	public void setParte_cuerpo(String parte_cuerpo) {
		this.parte_cuerpo = parte_cuerpo;
	}

	public String getNivel_proteccion() {
		return nivel_proteccion;
	}

	public void setNivel_proteccion(String nivel_proteccion) {
		this.nivel_proteccion = nivel_proteccion;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public Proteccion(String nombre, int precio, int id, String material, Deporte segmento_deportivo, String tamano, String color, String parte_cuerpo, String nivel_proteccion) {
		super(nombre, precio, id, segmento_deportivo,tamano, color);
		this.material = material;
		this.parte_cuerpo = parte_cuerpo;
		this.nivel_proteccion = nivel_proteccion;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id"+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+"\n"+ "Material: " + getMaterial()+"\n" + "Parte del cuerpo: " + getParte_cuerpo() +"\n" + "Nivel de proteccion: "+ getNivel_proteccion();
		
	}
}
