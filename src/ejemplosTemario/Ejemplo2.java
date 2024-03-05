package ejemplosTemario;

public class Ejemplo2 {

	public static void main(String[] args) {

		/*
		 * Este ejemplo está repesentando 2 arrays diferentes de tipo Reloj, el c2 crea
		 * un array de la subclase RelojAlarma
		 * 
		 * Nose como usar bien la clase de LocalTime, por lo que aunque he intentado que
		 * de la hora personalizada me esta dando problemas :(
		 */

		Reloj[] c1 = new Reloj[3];
		Reloj[] c2 = new RelojAlarma[3];

		for (int i = 0; i < c1.length; i++) {

			Reloj r1 = new Reloj(i, i, i);

			c1[i] = r1;

			System.out.println(c1[i]);
		}

		for (int j = 0; j < c2.length; j++) {
			Reloj r2 = new RelojAlarma(j, j, j);

			c2[j] = r2;

			System.out.println(c2[j]);
		}

	}

}
