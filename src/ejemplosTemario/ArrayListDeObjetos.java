package ejemplosTemario;

import java.util.ArrayList;

import java.util.List;

 

public class ArrayListDeObjetos {

 

public static void main(String[] args) {

//Definición ArrayList

List miLista = new ArrayList<>();

miLista.add("hola");

miLista.add(25);

miLista.add("hola holiwi");

 

String primerDato = (String)miLista.get(0);

System.out.println(primerDato);

//Integer segundoDato = miLista.get(1);

Integer segundoDato = (Integer)miLista.get(1);

System.out.println(segundoDato);


String tercerDato = (String)miLista.get(2);

System.out.println(tercerDato);
 

}

}
