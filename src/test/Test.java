package test;

public class Test implements Comparable<String> {
	private String nombre;
	
	public Test(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(String o) {
		return this.nombre.compareTo(o);
	}

	@Override
	public String toString() {
		return "nombre: " + this.nombre;
	}
	
	
}
