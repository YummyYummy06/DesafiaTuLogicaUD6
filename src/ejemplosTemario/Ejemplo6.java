package ejemplosTemario;

public class Ejemplo6 {
	
	
	public static void main(String[] args) {

		int[] x = { -5, 12, 15, 20, 30, 72, 456 };

		int indiceInferior = 0;

		int indiceSuperior = x.length - 1;

		int indiceMedio;

		int buscado = 72;

		boolean fin=false;

		while ((indiceInferior <= indiceSuperior) && (!fin)) {

		indiceMedio = (indiceInferior + indiceSuperior) / 2;

		if (buscado > x[indiceMedio])

		indiceInferior = indiceMedio + 1;

		else if (buscado < x[indiceMedio])

		indiceSuperior = indiceMedio - 1;

		else

		fin=true;

		}

		if (indiceInferior>indiceSuperior)

		System.out.println (buscado + " no encontrado");

		else

		System.out.println (buscado + " encontrado");

		}

}
