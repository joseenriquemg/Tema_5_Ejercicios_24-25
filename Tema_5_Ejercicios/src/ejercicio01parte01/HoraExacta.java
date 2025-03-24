package ejercicio01parte01;

public class HoraExacta extends Hora {

	private int segundos;

	public HoraExacta(int horas, int minutos, int segundos) {

		super(horas, minutos);

		this.segundos = segundos;

	}

	public void setSegundos(int segundos) {

		if (segundos >= 0 && segundos < 60) {

			this.segundos = segundos;

		}
	}

	public void inc() {

		if (segundos >= 0 && segundos < 59) {

			this.segundos++;

		} else {

			super.inc();
			this.segundos = 0;

		}

	}

	public String toString() {

		return super.toString() + ":" + segundos;

	}

}
