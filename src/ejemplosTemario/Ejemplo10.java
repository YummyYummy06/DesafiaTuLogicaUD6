package ejemplosTemario;

public class Ejemplo10 {
	
	
	static int[][] multiplicaMatrices(int[][] a, int[][] b) {

		// Si el nº de columnas de la matriz a es distinto

		// del nº de filas de la matriz b nos muestra un error

		if (a[0].length != b.length) {

		System.err.println("El nº de columnas de la matriz a es \r\n" +

		" distinto del nº de filas de la matriz b ");

		return null;

		}

		int[][] result = new int[a.length][];

		for (int i=0; i<result.length;i++)

		result[i]=new int[b[0].length];

		// Realiza la multiplicación y la suma

		for (int i=0;i<a.length;i++)

		for (int j=0;j<b[0].length;j++)

		for (int k=0;k<a[0].length;k++)

		result[i][j] += a[i][k] * b[k][j];

		// Devuelve la matriz resultante

		return result;

		}

}
