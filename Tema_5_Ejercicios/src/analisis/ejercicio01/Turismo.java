package analisis.ejercicio01;

public class Turismo extends Vehiculo {

	private int numeroPlazas;

	private enum TipoUso {
		PROFESIONAL, PARTICULAR
	};

	private TipoUso uso;

	public String getUso() {

		String uso;

		switch (this.uso) {

		case PARTICULAR -> {

			uso = "Particular";

		}

		case PROFESIONAL -> {

			uso = "Profesional";

		}

		default -> {

			uso = "Null";

		}

		}

		return uso;

	}

	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String uso) {
		super(marca, modelo, color, matricula);

		if (numeroPlazas >= 2) {

			this.numeroPlazas = numeroPlazas;

		}
	}

	public int getNumeroPlazas() {

		return numeroPlazas;

	}

	public void setNumeroPlazas(int numeroPlazas) {

		if (numeroPlazas >= 2) {

			this.numeroPlazas = numeroPlazas;

		}
	}
	
	public void compruebaUso() {
		
		
		
	}

}
