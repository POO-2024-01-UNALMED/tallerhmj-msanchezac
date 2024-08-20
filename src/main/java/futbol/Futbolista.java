package futbol;

public abstract class Futbolista implements Comparable{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this.nombre = "Maradona";
		this.posicion = "delantero";
		this.edad = 30;
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public boolean equals(Futbolista p) {
		return this == p;
	}
	
	abstract public boolean jugarConLasManos();
	
	@Override
	public String toString() {
		return "El futbolista " +nombre+ " tiene " +edad+ ", y juega de " +posicion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
}
