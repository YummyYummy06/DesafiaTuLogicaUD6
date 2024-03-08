package ejemplosTemario;

import java.util.HashSet;



public class EjemploHashSet {

public static void main(String[] args) {

// Crear un HashSet de cadenas

HashSet<String> nombres = new HashSet<>();

 

// Agregar elementos al HashSet

nombres.add("Nuria");

nombres.add("Daniel");

nombres.add("Rocío");

 

// Intento de agregar un duplicado

nombres.add("Nuria");

 

// Mostrar elementos del HashSet

System.out.println("Elementos del HashSet:\n");

for (String nombre : nombres) {

System.out.println(nombre);

}

 

// Verificar si un elemento existe en el HashSet

boolean existeAlice = nombres.contains("Nuria");

boolean existeDavid = nombres.contains("David");

 

System.out.println("\n¿Existe Nuria? " + existeAlice);

System.out.println("\n¿Existe David? " + existeDavid);

 

// Eliminar un elemento del HashSet

nombres.remove("Daniel");

 

// Mostrar elementos actualizados

System.out.println("\nElementos después de eliminar:\n");

for (String nombre : nombres) {

System.out.println(nombre);

}

}

}
