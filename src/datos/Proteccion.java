package datos;

public class Proteccion extends Equipamento {
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public Proteccion(String nombre, int precio, int id, String material) {
		super(nombre, precio, id);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Proteccion [material=" + material + ", getMaterial()=" + getMaterial() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}