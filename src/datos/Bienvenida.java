package datos;

public abstract class Bienvenida {
	private String saludo;
	private String descripcion;
	private String despedida;
	
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDespedida() {
		return despedida;
	}
	public void setDespedida(String despedida) {
		this.despedida = despedida;
	}
	
	public abstract void presentarse();
	
	public Bienvenida(String saludo, String descripcion, String despedida) {
		this.descripcion = descripcion;
		this.despedida = despedida;
		this.saludo = saludo;
	}
}
