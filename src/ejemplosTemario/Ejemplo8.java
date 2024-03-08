package ejemplosTemario;

public class Ejemplo8 {
	
	public static void main(String[] args) {

		double[][] temperaturas = new double[2][];

		// La matriz tiene 2 filas

		temperaturas[0]=new double[3];

		// La primera fila tiene 3 columnas

		temperaturas[1]=new double[3];

		// La segunda fila tiene 3 columnas

		temperaturas[0][0]=20.5; // Se asignan valores para la fila 0

		temperaturas[0][1]=30.6;

		temperaturas[0][2]=28.3;

		temperaturas[1][0]=-38.7; //Se asignan valores para la fila 1

		temperaturas[1][1]=-18.3;

		temperaturas[1][2]=-16.2;

		}
}
