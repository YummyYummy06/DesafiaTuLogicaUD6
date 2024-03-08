package ejemplosTemario;

import java.util.HashMap;

import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args) {

		Map<String, Empleado> plantilla = new HashMap<String, Empleado>();

		plantilla.put("34806509V", new Empleado("Jesús Gómez"));

		plantilla.put("34111261A", new Empleado("Vanesa Muñoz"));

		plantilla.remove("34806408V");

		System.out.println("El DNI 34806509V corresponde a "

				+ plantilla.get("34806509V"));

//recorrer todas las entradas del mapa

		System.out.println("\nListado de empleados:");

		System.out.println("--------------------");

		for (Map.Entry<String, Empleado> entrada : plantilla.entrySet())

		{

			String clave = entrada.getKey();

			Empleado e = entrada.getValue();

			System.out.println("\nclave = " + clave

					+ ", valor = "

					+ e);

		}

	}

	static class Empleado {

		private String nombre;

		public Empleado(String nombre) {

			this.nombre = nombre;

		}

		public String getNombre() {

			return nombre;

		}

		public void setNombre(String nombre) {

			this.nombre = nombre;

		}

		@Override

		public String toString() {

			return '\'' + nombre + '\'';

		}

	}

}
