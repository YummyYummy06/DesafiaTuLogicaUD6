package retoUD6;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cluedo {

	public static void main(String[] args) {

		/*
		 * La información de los personajes, armas y habitaciones disponibles estarán
		 * almacenados en tres arrays unidimensionales respectivamente y disponibles al
		 * comienzo.
		 */

		String[] nombresPersonajes = { "Amapola", "Celeste", "Prado", "Mora", "Rubio", "Blanco" };

		String[] nombresArmas = { "Bate", "Pistola", "Candelabro", "Cuchillo", "Cuerda", "Hacha", "Pesa", "Veneno",
				"Trofeo" };

		String[] nombresLugares = { "Casa de invitados", "Teatro", "Spa", "Observatorio", "Comedor", "Terraza", "Salón",
				"Cocina", "Vestíbulo" };

		ArrayList[] listaDinamica;

		String nombreArchivo = "Cluedo.txt";

		File archivoTexto = new File(nombreArchivo);

		/*
		 * Inicialmente la aplicación comienza mostrando un mensaje de bienvenida o
		 * similar que indique al usuario que este programa se encarga de barajar las
		 * cartas de forma aleatoria para jugar al Cluedo.
		 */

		System.out.println(
				"Bienvenido al Cluedo:\n" + "\nEste juego se ocupa de barajar las cartas por ti,\ndisfruta del juego:");

		/*
		 * Se le muestran todos los personajes, armas y habitaciones disponibles en el
		 * sistema (se recorren los arrays) y se le pregunta si quiere añadir algo más.
		 */

		System.out.println("\nEstas son las cartas disponibles:\n" + "\n--------------" + "\nPersonajes:   |"
				+ "\n--------------");

		for (int i = 0; i < nombresPersonajes.length; i++) {
			System.out.println(" + " + nombresPersonajes[i]);
		}

		System.out.println("\n---------" + "\nArmas:   |" + "\n---------");

		for (int i = 0; i < nombresArmas.length; i++) {
			System.out.println(" + " + nombresArmas[i]);
		}

		System.out.println("\n-----------" + "\nLugares:   |" + "\n-----------");

		for (int i = 0; i < nombresLugares.length; i++) {
			System.out.println(" + " + nombresLugares[i]);
		}

		System.out.println("\n\n ¿Quieres anadir algo mas?");

		/*
		 * En caso afirmativo, se muestra un menú numerado del 1 al 4, con cuatro
		 * opciones que serán: 1.Personaje 2.Arma 3.Habitación 4. Salir i. Según la
		 * opción escogida se llamará a un método concreto que se encargará de solicitar
		 * en bucle, bien la introducción de personas (opción 1), bien armas (opción 2)
		 * o bien habitaciones (opción 3) de forma continuada hasta que el usuario
		 * decida no seguir introduciendo la opción que ha escogido. Cada dato
		 * introducido (persona, arma o habitación) se almacena en el array
		 * correspondiente. El menú puede aparecer más de una vez, dependiendo de si el
		 * usuario quiere o no continuar añadiendo.
		 */

		
		int respuesta;
		do {
			mostrarMenu();
			Scanner sc = new Scanner(System.in);
			 respuesta = sc.nextInt();

			switch (respuesta) {
			case 1: {
				nombresPersonajes[nombresPersonajes.length + 1]= "Prueba";
				break;
			}

			case 2: {
				anadirArma();
				break;
			}

			case 3: {
				anadirLugar();
				break;
			}
			
			case 4:
			{
				break;
			}

			default: {
				System.out.println("No es una opción correcta");
				break;
			}
			}

		} while (respuesta !=4);
		
		
		
		
		for (int i = 0; i < nombresPersonajes.length; i++) {
			System.out.println(" + " + nombresPersonajes[i]);
		}
		

	}
	
	
	
	
	
	
	
	
	//Metodos

	static void mostrarMenu() {
		System.out.println("\n\n  ------\n | MENÚ |" + "\n  ------");
		System.out.println(" ---------------");
		System.out.println("| 1.Personaje   |" + "\n| 2.Arma        |" + "\n| 3.Habitación  |" + "\n| 4.Salir       |");
		System.out.println(" ---------------");
	}

	static String anadirPersonaje() {
		Scanner sc = new Scanner(System.in);

		String respuesta;

		System.out.println("Introduce el nombre del nuevo personaje");

		respuesta = sc.next();

		return respuesta;

	}

	static String anadirArma() {
		Scanner sc = new Scanner(System.in);

		String respuesta;

		System.out.println("Introduce el nombre de la nueva arma");

		respuesta = sc.next();

		return respuesta;

	}

	static String anadirLugar() {
		Scanner sc = new Scanner(System.in);

		String respuesta;

		System.out.println("Introduce el nombre del nuevo lugar");

		respuesta = sc.next();

		return respuesta;

	}

}
