package foreach;

public class Persona {
	
	protected String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
