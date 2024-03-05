package ejemplosTemario;

public class Ejemplo1 {

	public static void main(String[] args) {

		// Con esta forma está creando un array del tipo INT que tiene un tamano de 5
		// posiciones

		int[] resultadosTest = new int[5];

		// Hago un bucle for para que me ensene lo que ha guardado en cada posición del
		// array

		for (int i = 0; i < resultadosTest.length; i++) {

			/*
			 * Con esta orden, estoy mandando que asigne el valor del 1 al 5 en cada
			 * posicion respectivamente para así poder diferenciarlos
			 */

			resultadosTest[i] = i + 1;

			System.out.println(resultadosTest[i]);
		}

	}

}
