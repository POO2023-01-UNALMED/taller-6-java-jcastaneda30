package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	public static int CantidadCamion;
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.setEjes(ejes);
		CantidadCamion++;
		Vehiculo.vehiculos.add(this);
	}
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
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
