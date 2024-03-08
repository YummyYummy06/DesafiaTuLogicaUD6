package ejemplosTemario;

public class Ejemplo18 {

	
	public static void main(String[] args) {

		 

		String frase = "Hola, cómo estás? Estoy bien, gracias.";

		System.out.println("Longitud de la cadena: "

		+ frase.length()

		+ "\n"

		);

		 

		/*mostrar en pantalla el índice de cada letra dentro de

		la cadena*/

		for (int i = 0; i < frase.length(); i++) {

		char caracter = frase.charAt(i);

		System.out.println("Carácter #" + i + ": " + caracter);

		}

		 

		/* Buscar la primera ocurrencia de la letra 'o' después

		del índice 10*/

		int primeraOcurrenciaDespuesDe = frase.indexOf('o', 10);

		System.out.println("\nPrimera ocurrencia de 'o' después del índice 10: " + primeraOcurrenciaDespuesDe);

		 

		// Buscar la última ocurrencia de la letra 'e'

		int ultimaOcurrenciaDeE = frase.lastIndexOf('e');

		System.out.println("Última ocurrencia de 'e': "

		+ ultimaOcurrenciaDeE);

		}
	
	
}
