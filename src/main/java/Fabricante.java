package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public int cantidadFabrica;
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void Vendidos(){
		cantidadFabrica++;
	}
	public int fabricaMayorVentas() {
		return cantidadFabrica;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
