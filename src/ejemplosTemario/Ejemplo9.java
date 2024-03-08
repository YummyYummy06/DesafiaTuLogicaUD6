package ejemplosTemario;

public class Ejemplo9 {

	public static void main(String[] args) {

		double[][] temperaturas = { {20.5,30.6,28.3},

		{-38.7,-18.3,-16.2} };

		temperaturas[0][1] = 18.3; // Reemplaza 30.6 por 18.3

		System.out.println(temperaturas[1][2]); // Salida: -16.2

		}

		
	
	
}
