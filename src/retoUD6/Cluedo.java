package retoUD6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

		System.out.println("\n\n ¿Quieres anadir algo mas?"
				+ "\nPulsa cualquier tecla para ver el menú o pulsa (-) para continuar sin cambios");

		Scanner sc = new Scanner(System.in);

		String respuesta;

		String nuevoItem;

		respuesta = sc.next();

		if (!respuesta.equalsIgnoreCase("-")) {

			int respuestaN = 0;

			int numeroCambios;

			do {

				mostrarMenu();

				System.out.println("Selecciona el número correspondiente" + "\ndonde te gustaría realizar cambios:");

				respuestaN = sc.nextInt();

				/*
				 * Según la opción escogida se le pregunta al usuario cuántos personajes, armas
				 * o habitaciones quiere introducir. Y se llama al método
				 * actualizarArray(arrayAntiguo, num) (pasándole como parámetros el array
				 * correspondiente a personaje, arma o habitación y el número de
				 * inserciones).(Se adjunta explicación y código del método).
				 * 
				 * 
				 * 
				 * 
				 * El menúanterior(1.Persona,2.Arma,3.Habitación,4.Salir)puede aparecer más de
				 * una vez, dependiendo de si el usuario quiere o no continuar añadiendo.
				 */

				switch (respuestaN) {

				case 1: {

					System.out.println("¿Cuántos personajes te gustaría anadir?");

					numeroCambios = sc.nextInt();

					/*
					 * Aquí OJO a este paso de abajo ya que yo solamente estaba llamando al método
					 * actualizarArray y NO lo estaba igualando con el arrayAnterior, me ha causado
					 * problemas durante mas de 1 hora encontrarlo!
					 * 
					 * (Yo estaba haciendo solo actualizarArray(nombresPersonajes, numeroCambios);)
					 * 
					 * y hasta que me he dado cuenta... En fin
					 */

					nombresPersonajes = actualizarArray(nombresPersonajes, numeroCambios);

					for (int i = nombresPersonajes.length - numeroCambios; i < nombresPersonajes.length; i++) {
						System.out.println("Escribe el nombre del personaje que quieras anadir: [" + i + "]:");

						nuevoItem = sc.next();

						nombresPersonajes[i] = nuevoItem;
					}

					System.out.println("Se ha ampliado la capacidad de los personajes");

					System.out.println("Actualmente, los personajes disponibles son: \n\n");

					mostrarArray(nombresPersonajes);

					break;

				}

				case 2: {

					System.out.println("¿Cuántas armas te gustaría anadir?");

					numeroCambios = sc.nextInt();

					nombresArmas = actualizarArray(nombresArmas, numeroCambios);

					for (int i = nombresArmas.length - numeroCambios; i < nombresArmas.length; i++) {
						System.out.println("Escribe el nombre del arma que quieras anadir: [" + i + "]:");

						nuevoItem = sc.next();

						nombresArmas[i] = nuevoItem;
					}

					System.out.println("Se ha ampliado la capacidad de las armas");

					System.out.println("Actualmente, las armas disponibles son: \n\n");

					mostrarArray(nombresArmas);

					break;
				}

				case 3: {

					System.out.println("¿Cuántos lugares te gustaría anadir?");

					numeroCambios = sc.nextInt();

					nombresLugares = actualizarArray(nombresLugares, numeroCambios);

					for (int i = nombresLugares.length - numeroCambios; i < nombresLugares.length; i++) {
						System.out.println("Escribe el nombre del lugar que quieras anadir: [" + i + "]:");

						nuevoItem = sc.next();

						nombresLugares[i] = nuevoItem;
					}

					System.out.println("Se ha ampliado la capacidad de los lugares");

					System.out.println("Actualmente, los lugares disponibles son: \n\n");

					mostrarArray(nombresLugares);

					break;

				}

				case 4:

				{

					System.out.println("Okay, sigámos adelante!");

					break;
				}

				default: {
					System.out.println("El número escogido no es correcto");

					break;
				}

				}

			} while (respuestaN != 4);

		}

		else {
			/*
			 * En caso contrario (el usuario no quiere introducir ni personas, ni armas, ni
			 * habitaciones nuevas, punto 3), se muestra un mensaje... ¡Genial, sigamos...!
			 */

			System.out.println("Okay, sigámos adelante!");
		}

		/*
		 * Se informa al usuario de que se va a producir la baraja de las cartas, para
		 * ello se llama a un método que se encarga de barajar (ver aclaración sobre
		 * barajar cartas) y almacenar el personaje, arma, habitación y hora como objeto
		 * de la lista dinámica que hemos creado anteriormente para este fin. Este
		 * método devolverá true o false en caso de que se haya podido o no hacer dicha
		 * operación (controla excepciones).
		 */

		System.out.println("\nVamos a proceder con el barajeo de cartas" + "\n..." + "\n......");

		int carta1, carta2, carta3;

		carta1 = barajarCartas(nombresPersonajes);

		carta2 = barajarCartas(nombresArmas);

		carta3 = barajarCartas(nombresLugares);

		System.out.println("El personaje que ha salido es: " + nombresPersonajes[carta1] + "\nEl arma que ha salido es: "
						+ nombresArmas[carta2] + "\nEl lugar que ha salido es: " + nombresLugares[carta3]);

	}

	// Metodos

	static void mostrarMenu() {
		System.out.println("\n\n  ------\n | MENÚ |" + "\n  ------");
		System.out.println(" ---------------");
		System.out.println("| 1.Personaje   |" + "\n| 2.Arma        |" + "\n| 3.Habitación  |" + "\n| 4.Salir       |");
		System.out.println(" ---------------");
	}

	static String[] actualizarArray(String[] arrayAntiguo, int num) {

		// Creamos un nuevo array para poder copiar el contenido en él

		String[] arrayNuevo = new String[arrayAntiguo.length + num];

		// Con esto copiamos un array en otro array con las posiciones deseadas

		System.arraycopy(arrayAntiguo, 0, arrayNuevo, 0, arrayAntiguo.length);

		return arrayNuevo;

	}

	static String[] mostrarArray(String[] nombreArray)

	{

		String[] resultado = new String[nombreArray.length];

		for (int i = 0; i < nombreArray.length; i++)

		{
			resultado[i] = "+ " + nombreArray[i];
			System.out.println(resultado[i]);
		}

		return resultado;
	}

	static int barajarCartas(String[] lista) {
		int num;

		num = (int) (Math.random() * lista.length);
		

		return num;
		
		

	}
	
	

}
