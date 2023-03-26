package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int CantidadCamioneta;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		CantidadCamioneta++;
		fabricante.Vendidos();
		fabricante.getPais().vender();
	}
	public boolean getVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
