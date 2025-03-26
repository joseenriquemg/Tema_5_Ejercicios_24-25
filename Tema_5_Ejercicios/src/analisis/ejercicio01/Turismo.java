package analisis.ejercicio01;

public class Turismo extends Vehiculo {

	private int numeroPlazas;

	private enum TipoUso {
		PROFESIONAL, PARTICULAR
	};
	
	private TipoUso uso;

	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas) {
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

}
