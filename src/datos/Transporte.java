package datos;

public class Transporte extends Equipamento {
	private String vehiculo;

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Transporte(String nombre, int precio, int id, Deporte segmento_deportivo, String vehiculo) {
		super(nombre, precio, id, segmento_deportivo);
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Nombre: "+ getNombre() + "\n" + "Precio: " + getPrecio()+"\n"+ "id"+ getId() +"\n"+ "Segmento deportivo: "+ getSegmento_deportivo()+"\n"+ "Vehiculo: "+ getVehiculo();
	}

}
