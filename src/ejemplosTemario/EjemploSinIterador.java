package ejemplosTemario;

import java.util.ArrayList;

import java.util.List;

 

public class EjemploSinIterador {

public static void main(String[] args) {

List<String> lista = new ArrayList<>();

lista.add("Elemento 1");

lista.add("Elemento 2");

lista.add("Elemento 3");

 

for (int i = 0; i < lista.size(); i++) {

System.out.println(lista.get(i));

}

}

}