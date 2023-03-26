package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	public static int CantidadAutomovil;
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int puestos){
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.setPuestos(puestos);
		CantidadAutomovil++;
		Vehiculo.vehiculos.add(this);
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
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
