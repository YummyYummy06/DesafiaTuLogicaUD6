package retoUD6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

		ArrayList<String> listaDinamica = new ArrayList<>();

		LocalDateTime horaActual = LocalDateTime.now();

		String nombreArchivo = "Cluedo.txt";

		File archivoTexto = new File(nombreArchivo);

		String claveSecreta = "SECRETA";

		String password;

		String continuar;

		Jugador j1 = null;

		do {

			/*
			 * Inicialmente la aplicación comienza mostrando un mensaje de bienvenida o
			 * similar que indique al usuario que este programa se encarga de barajar las
			 * cartas de forma aleatoria para jugar al Cluedo.
			 */

			System.out.println("Bienvenido al Cluedo:\n"
					+ "\nEste juego se ocupa de barajar las cartas por ti,\ndisfruta del juego:");

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

					System.out
							.println("Selecciona el número correspondiente" + "\ndonde te gustaría realizar cambios:");

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

			LocalTime hora = LocalTime.now();

			barajarCartas(nombresPersonajes, listaDinamica);

			barajarCartas(nombresArmas, listaDinamica);

			barajarCartas(nombresLugares, listaDinamica);

			listaDinamica.add(hora.toString());

			j1 = new Jugador(listaDinamica.get(0), listaDinamica.get(1), listaDinamica.get(2),
					LocalTime.parse(listaDinamica.get(3)));

			/*
			 * Si se ha conseguido barajar las cartas correctamente entonces tendremos una
			 * combinación de personaje, arma, habitación y hora del sistema almacenada en
			 * la lista dinámica (último elemento de mi lista). A continuación, damos la
			 * opción al usuario de ver las cartas (en caso de que se hayan podido barajar)
			 * y por tanto conocer al asesino, el arma y la habitación, pero solo si conoce
			 * una clave que nosotros tenemos guardada (invéntate una). Para ello le
			 * decimos...” Si introduces la clave correcta te puedo mostrar quien ha sido el
			 * culpable, como y donde...” (o similar)
			 */

			// Vamos a comprobar que el tamano de la lista sea mas grande que 0
			// lo cual indicará que las cartas se han barajado y guardado correctamente

			if (listaDinamica.size() > 0)

			{
				System.out.println("\n\n¿Te gustaría ver las cartas?"
						+ "\nnecesito que introduzcas la clave SECRETA para poder" + "\nmostrarte la verdad.");

				password = sc.next();

				/*
				 * Si la clave es correcta mostramos la combinación de cartas de la partida
				 * actual.
				 */

				if (password.equalsIgnoreCase(claveSecreta)) {
					System.out.println(j1.toString());
				} else

				{

					/*
					 * Si la clave no es correcta y no coincide con la que tenemos guardada entonces
					 * le indicamos que no tiene permiso para verlas. Seguimos con el punto 6.
					 */

					System.out.println("Oh No! La clave es incorrecta!");

				}

			} else {
				System.out.println("Algo ha ocurrido mal y no se han guardado las cartas correctamente");
			}

			/*
			 * Por último, preguntamos al usuario ... ¿Quieres crear una nueva combinación
			 * para el juego?
			 */

			System.out.println("\n\n¿Quieres crear una nueva combinación para el juego?"
					+ "\nPulsa cualquier tecla para cambiar la combinación o pulsa (-) para continuar sin cambios");

			continuar = sc.next();

			sc.close();

		} while (!continuar.equalsIgnoreCase("-"));

		/*
		 * En cualquier otro caso, el usuario desea salir. En este momento, se pasa la
		 * información de todas las combinaciones de cartas realizadas durante la sesión
		 * a nuestro fichero de texto (indicado al principio), pero además se
		 * introducirá (en la cabecera del fichero) la fecha del momento de cierre.
		 */

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoTexto))) {

			oos.writeBytes("Fecha: " + horaActual.getYear() + "/" + horaActual.getMonthValue() + "/"
					+ horaActual.getDayOfMonth() + j1.toString() + "Fecha: " + horaActual.getYear() + "/" + horaActual.getMonthValue() + "/"
							+ horaActual.getDayOfMonth() );

		} catch (IOException e) {
			e.getMessage();

			System.out.println("Ha ocurrido un error al guardar los datos en el archivo");
		}

		/*
		 * Mostramos un mensaje de despedida y finalizamos la ejecución del programa.
		 * (se acaba la sesión)
		 */

		System.out.println("\n\nHasta pronto!");

		/*
		 * Comprueba que en tu fichero de texto aparecen todas las combinaciones
		 * realizadas para cada hora, bien de forma manual desde el sistema operativo o
		 * bien crea una clase que tenga un método main desde el que se recupere toda la
		 * información de dicho fichero y se muestre en pantalla.
		 */
		
		
		
		try(BufferedReader bf = new BufferedReader(new FileReader(archivoTexto)))
		{ String linea;

	    while ((linea = bf.readLine()) != null) 
	    	{
				System.out.println(linea);
			}
			
		}
		catch (IOException e)
		{
			System.out.println("No se ha podido leer en el archivo");
			e.getMessage();
		}

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

	static boolean barajarCartas(String[] listaParaBarajar, ArrayList<String> listaDondeSeGuarda) {
		try {

			int num;

			num = (int) (Math.random() * listaParaBarajar.length);

			listaDondeSeGuarda.add(listaParaBarajar[num]);

			System.out.println("Se ha anadido correctamente la carta en la lista");

			return true;

		}

		catch (Exception e) {

			e.printStackTrace();
			e.getMessage();
			System.out.println("No se ha podido anadir la carta a la lista");
			return false;
		}

	}

}
