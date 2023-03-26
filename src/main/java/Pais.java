package vehiculos;

public class Pais {
	private String nombre;
	public int cantidadPais;
	public Pais(String nombre) {
		this.setNombre(nombre);
	}
	public void vender() {
		cantidadPais++;
	}
	public int paisMasVendedor() {
		return cantidadPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
