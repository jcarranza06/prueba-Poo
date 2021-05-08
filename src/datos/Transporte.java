package datos;

public class Transporte extends Equipamento {
	private String vehiculo;
	private String tipo;
	private String amateur_avanzado;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAmateur_avanzado() {
		return amateur_avanzado;
	}

	public void setAmateur_avanzado(String amateur_avanzado) {
		this.amateur_avanzado = amateur_avanzado;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Transporte(String nombre, int precio, int id, Deporte segmento_deportivo,String tamano, String color, String vehiculo,String tipo, String amateur_avanzado) {
		super(nombre, precio, id, segmento_deportivo,tamano, color);
		this.vehiculo = vehiculo;
		this.tipo = tipo;
		this.amateur_avanzado = amateur_avanzado;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id"+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+"\n"+ "Vehiculo: "+ getVehiculo() +"\n" + "Tipo: " + getTipo()+"\n" + "Amateur o avanzado: "+ getAmateur_avanzado();
	}

}
