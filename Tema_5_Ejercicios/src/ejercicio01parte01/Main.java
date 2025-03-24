package ejercicio01parte01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int horas;

		int minutos;

		int segundos;
		
		int eleccion = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca las horas:");

		horas = sc.nextInt();
		
		System.out.println("Introduzca los minutos:");
		
		minutos = sc.nextInt();
		
		System.out.println("Introduzca los segundos:");
		
		segundos = sc.nextInt();
		
		HoraExacta reloj = new HoraExacta (horas, minutos, segundos);
		
		while (eleccion != 6) {
			
			System.out.println("Menu de opciones:");
			System.out.println("1. Cambiar hora:");
			System.out.println("2. Mostrar segundos");
			System.out.println("3. Mostrar minutos");
			System.out.println("4. Mostrar horas");
			System.out.println("5. Incrementar segundo");
			System.out.println("6. Salir");
			
			
			System.out.println("Seleccione una opcion:");
			
			eleccion = sc.nextInt();
			
			System.out.println(reloj);
			
		}
		

		sc.close();

	}

}
