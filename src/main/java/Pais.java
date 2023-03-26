package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pais {
	private String nombre;
	public static Map<Pais, Integer> vehiculo2 = new HashMap<Pais, Integer>();
	public Pais(String nombre) {
		this.setNombre(nombre);
	}

	public static Pais paisMasVendedor() {
		for(Vehiculo cosa:Vehiculo.vehiculos) {
			if(vehiculo2.containsKey(cosa.getFabricante().getPais())) {
				int valor = vehiculo2.get(cosa.getFabricante().getPais());
				valor++;
				vehiculo2.put(cosa.getFabricante().getPais(),valor);
			}else {
				vehiculo2.put(cosa.getFabricante().getPais(), 1);
			}
		}
		int ventas = Integer.MIN_VALUE; // 
		Pais fabricador = null; // 
		for (Entry<Pais, Integer> entry : vehiculo2.entrySet()) {
		    if (entry.getValue() > ventas) {
		        ventas = entry.getValue();
		        fabricador = entry.getKey();
		    }
		}
		return fabricador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
