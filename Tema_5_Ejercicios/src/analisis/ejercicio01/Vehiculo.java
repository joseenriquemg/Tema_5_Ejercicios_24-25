package analisis.ejercicio01;

public class Vehiculo {

	private String marca;

	private String modelo;

	private String color;

	private String matricula;

	private boolean motorEncendido = false;

	private int marchaActual;

	private int velocidadActual;

	public Vehiculo(String marca, String modelo, String color, String matricula) {

		if (!marca.isBlank() && marca != null) {

			this.marca = marca;

		}

		if (!modelo.isBlank() && modelo != null) {

			this.modelo = modelo;

		}

		if (!color.isBlank() && color != null) {

			this.color = color;

		}

		if (!matricula.isBlank() && matricula != null) {

			this.matricula = matricula;

		}

	}

	public void parar() {

		motorEncendido = false;

	}

	public void arrancar() {

		motorEncendido = true;

	}

	public void subirMarcha() {

		if (marchaActual >= 1 && marchaActual < 5) {

			marchaActual++;

		} else {
			
			
			
		}

	}

	public void bajarMarcha() {

		if (marchaActual > 1) {

			marchaActual--;

		} else {

			
			
		}

	}

}
