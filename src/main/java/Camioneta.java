package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	public static int CantidadCamioneta;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		CantidadCamioneta++;
		Vehiculo.vehiculos.add(this);
	}
	public boolean getVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public String getPlaca() {
        return super.placa;
    }

    public void setPlaca(String placa) {
        super.placa = placa;
    }

    public int getPuertas() {
        return super.puertas;
    }

    public void setPuertas(int puertas) {
        super.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return super.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        super.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return super.nombre;
    }

    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public int getPrecio() {
        return super.precio;
    }

    public void setPrecio(int precio) {
        super.precio = precio;
    }

    public int getPeso() {
        return super.peso;
    }

    public void setPeso(int peso) {
        super.peso = peso;
    }

    public String getTraccion() {
        return super.traccion;
    }

    public void setTraccion(String traccion) {
    	super.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return super.fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
    	super.fabricante = fabricante;
    }
}