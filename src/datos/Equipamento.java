package datos;

public class Equipamento extends producto{
	
	private String segmento_deportivo;

	public String getSegmento_deportivo() {
		return segmento_deportivo;
	}

	public void setSegmento_deportivo(String segmento_deportivo) {
		this.segmento_deportivo = segmento_deportivo;
	}
	public Equipamento(String nombre, int precio, int id, String segmento_deportivo) {
		super(nombre, precio, id);
		this.segmento_deportivo = segmento_deportivo;
	}

	@Override
	public String toString() {
		return "Equipamento [segmento_deportivo=" + segmento_deportivo + ", getSegmento_deportivo()="
				+ getSegmento_deportivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
