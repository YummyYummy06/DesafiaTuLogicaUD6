package ejemplosTemario;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

public class EjemploRemoveIterator {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Elemento 1");

		lista.add("Elemento 2");

		lista.add("Elemento 3");

		lista.add("Elemento 2");

// Mostrar la lista antes de la eliminación

		System.out.println("Lista antes de la eliminación:");

		for (String elemento : lista) {

			System.out.println(elemento);

		}

//creación del iterador

		Iterator<String> it = lista.iterator();

//recorrer la lista

		while (it.hasNext()) {

			String elemento = it.next();

			if (elemento.equals("Elemento 2")) {

// Elimina el elemento "Elemento 2"

				it.remove();

			}

		}

// Mostrar la lista después de la eliminación

		System.out.println("\nLista después de la eliminación:\n" + lista);

	}

}
