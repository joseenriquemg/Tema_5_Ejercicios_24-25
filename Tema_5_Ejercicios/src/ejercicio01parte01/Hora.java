package ejercicio01parte01;

public class Hora {

	private int horas;

	private int minutos;

	public Hora(int horas, int minutos) {

		if (horas >= 0 && horas < 24) {

			this.horas = horas;

		}

		if (minutos >= 0 && minutos < 60) {

			this.minutos = minutos;

		}

	}

	public void inc() {

		if (this.minutos < 59) {

			this.minutos++;

		} else {

			if (this.horas < 23) {

				this.horas++;

			} else {

				this.horas = 0;

			}

			this.minutos = 0;

		}

	}

	public boolean setMinutos(int minutos) {

		boolean esPosible = false;

		if (minutos >= 0 && minutos < 60) {

			this.minutos = minutos;

			esPosible = true;

		}

		return esPosible;

	}

	public boolean setHoras(int horas) {

		boolean esPosible = false;

		if (horas >= 0 && horas < 60) {

			this.minutos = horas;

			esPosible = true;

		}

		return esPosible;

	}

	public String toString() {

		String resultado = horas + ":" + minutos;

		return resultado;

	}

}
