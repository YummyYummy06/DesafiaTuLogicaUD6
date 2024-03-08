package ejemplosTemario;

public class Ejemplo16 {

	public static void main(String[] args) {

		String frase = "Hola, mundo!";

		 

		// Obtener la longitud de la cadena

		int longitud = frase.length();

		System.out.println("Longitud de la cadena: " +

		longitud);

		 

		// Acceder a caracteres individuales usando charAt()

		char primerCaracter = frase.charAt(0);

		char ultimoCaracter = frase.charAt(longitud - 1);

		 

		// Mostrar primer y último caracter

		System.out.println("Primer caracter: " +

		primerCaracter);

		System.out.println("Último caracter: " +

		ultimoCaracter);

		}
	
	
}
