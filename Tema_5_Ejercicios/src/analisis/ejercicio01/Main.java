package analisis.ejercicio01;

public class Main {

	public static void main(String[] args) {

		String marca = "";

		String modelo = "";

		String color = "";

		String matricula = "";
		
		int opcion = 0;

		Vehiculo v = new Vehiculo(marca, modelo, color, matricula);
		
		while (opcion != 6) {
			
			System.out.println("Elija una opcion:");
			System.out.println("1. Arrancar vehiculo");
			System.out.println("2. Parar vehiculo");
			System.out.println("3. Acelerar vehiculo");
			System.out.println("4. Frenar vehiculo");
			System.out.println("5. Ver datos del coche");
			System.out.println("6. Salir del programa");
			
			
			switch (opcion) {
			
			case 1 -> {
				
				v.arrancar();
				
			}
			
			case 2 -> {
				
				v.parar();
				
			}
			
			}
			
			
		}

		v.subirMarcha();

		try {

			Thread.sleep(10000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}
		System.out.println("Me he esperado 10 segundos");
	}

}
