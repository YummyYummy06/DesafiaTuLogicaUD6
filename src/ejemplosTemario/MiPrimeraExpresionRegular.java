package ejemplosTemario;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

 

public class MiPrimeraExpresionRegular {

 

public static void main(String[] args) {

//Definir expresión regular

String patron = "casa";

 

//compilar la expresión regular en objeto Pattern

Pattern objetoPattern = Pattern.compile(patron);

 

//crear objeto Matcher

String texto = "La casa de la pradera.";

Matcher objetomatcher = objetoPattern.matcher(texto);

 

//Buscar coincidencias con el objeto Matcher

if (objetomatcher.find()) {

System.out.println("Se encontró una coincidencia.");

} else {

System.out.println("No se encontraron coincidencias.");

}

}

}
