package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static Map<Fabricante, Integer> vehiculo2 = new HashMap<Fabricante, Integer>();
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

	public static Fabricante fabricaMayorVentas() {
		for(Vehiculo cosa:Vehiculo.vehiculos) {
			if(vehiculo2.containsKey(cosa.getFabricante())) {
				int valor = vehiculo2.get(cosa.getFabricante());
				valor++;
				vehiculo2.put(cosa.getFabricante(),valor);
			}else {
				vehiculo2.put(cosa.getFabricante(), 1);
			}
		}
		int ventas = Integer.MIN_VALUE; 
		Fabricante fabricador = null; 
		for (Map.Entry<Fabricante, Integer> entry : vehiculo2.entrySet()) {
		    if (entry.getValue() > ventas) {
		        ventas = entry.getValue();
		        fabricador = entry.getKey();
		    }
		}
		return fabricador;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
