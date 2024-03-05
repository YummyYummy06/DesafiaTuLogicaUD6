package ejemplosTemario;

public class Ejemplo5 {

	public static void main(String[] args) {

		int i=0;

		int buscado = 72;

		int x[] = {20, 15, 12, 30, -5, 72, 456};

		boolean encontrado=false;

		while (!encontrado) {

			if (x[i] == buscado) {

					System.out.println("Encontrado: " + x[i]);

						encontrado=true;

					}

				i++;

				}

		if (!encontrado)

		System.out.println("No encontrado: " + buscado);

		}

}
