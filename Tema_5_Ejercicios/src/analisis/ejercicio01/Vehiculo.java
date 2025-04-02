package analisis.ejercicio01;

public class Vehiculo {

	private String marca;

	private String modelo;

	private String color;

	private String matricula;

	private boolean motorEncendido = false;

	private int marchaActual = 0;

	private int velocidadActual = 0;

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

		if (motorEncendido == true) {

			motorEncendido = false;

		}

	}

	public void arrancar() {

		if (!motorEncendido) {

			motorEncendido = true;

		}

	}

	public void subirMarcha() {

		if ((marchaActual >= 1 && marchaActual < 5) && !motorEncendido) {

			marchaActual++;

		}
	}

	public void bajarMarcha() {

		if (marchaActual > 1 && !motorEncendido) {

			marchaActual--;

		} else {

			motorEncendido = false;

		}
	}

	public int seleccionarMarcha() {

		int marcha = 0;

		while (this.velocidadActual < velocidadActual) {

			this.velocidadActual++;

			System.out.println(this.velocidadActual);

			if (this.velocidadActual >= 0 && this.velocidadActual < 30 && marchaActual < 1) {
				subirMarcha();
				System.out.println("Cambio de marcha: " + this.marchaActual);
			} else if (this.velocidadActual >= 30 && this.velocidadActual < 50 && marchaActual < 2) {
				subirMarcha();
				System.out.println("Cambio de marcha: " + this.marchaActual);
			} else if (this.velocidadActual >= 50 && this.velocidadActual < 70 && marchaActual < 3) {
				subirMarcha();
				System.out.println("Cambio de marcha: " + this.marchaActual);
			} else if (this.velocidadActual >= 70 && this.velocidadActual < 100 && marchaActual < 4) {
				subirMarcha();
				System.out.println("Cambio de marcha: " + this.marchaActual);
			} else if (this.velocidadActual >= 100 && marchaActual < 5) {
				subirMarcha();
				System.out.println("Cambio de marcha: " + this.marchaActual);
			}
		}
		
		return marcha;

	}

}
