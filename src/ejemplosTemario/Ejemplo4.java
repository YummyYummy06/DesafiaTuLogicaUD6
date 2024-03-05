package ejemplosTemario;

public class Ejemplo4 {

	public static void main(String[] args) {

		RelojAlarma[] ac = new RelojAlarma[1];
		Reloj[] c = ac;

		// c[0] = new Reloj();

		/*
		 * No puede hacer la anterior linea de código ya que esta asignando desde una
		 * clase que es hija a una padre, y debería de ser alreves, desde una clase
		 * padre a una hija, tal y como dice el ejemplo imagina que tiene métodos que la
		 * clase padre no tiene. Recordamos que la clase RelojAlarma es un extends de Reloj*/

	}

}
