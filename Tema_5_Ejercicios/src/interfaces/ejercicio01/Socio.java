package interfaces.ejercicio01;

public class Socio {

	private int id;

	private String nombre;

	private int edad;

	public Socio(int id, String nombre, int edad) {

		if (id >= 0) {

			this.id = id;

		}

		if (!nombre.isBlank() && nombre != null) {

			this.nombre = nombre;

		}

		if (edad >= 0) {

			this.edad = edad;

		}

	}

	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
