package datos;

public class Implemento extends Equipamento {
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Implemento(String nombre, int precio, int id, String segmento_deportivo, String marca) {
		super(nombre, precio, id, segmento_deportivo);
		this.marca = marca;
	}
	

	@Override
	public String toString() {
		return "Implemento [marca=" + marca + ", getMarca()=" + getMarca() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}