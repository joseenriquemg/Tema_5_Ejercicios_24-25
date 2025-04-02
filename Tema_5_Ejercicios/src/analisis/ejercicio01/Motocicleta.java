package analisis.ejercicio01;

public class Motocicleta extends Vehiculo {

	private int cilindrada = 0;

	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);

		if (cilindrada > 0) {

			this.cilindrada = cilindrada;

		}

	}

	public int getCilindrada() {

		return this.cilindrada;

	}

	public boolean requiereCarnet() {

		boolean esNecesario = false;

		if (this.cilindrada >= 125) {

			esNecesario = true;

		}

		return esNecesario;

	}

}
