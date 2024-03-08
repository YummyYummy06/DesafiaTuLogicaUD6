package ejemplosTemario;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

 

public class CoincidenciasAlPrincipio {

 

public static void main(String[] args) {

Pattern pat = Pattern.compile("^ABC.*");

String texto = "ABC es una marca de periódico.";

Matcher mat = pat.matcher(texto);

 

if (mat.matches()) {

System.out.println("Válido");

} else {

System.out.println("No Válido");

}

}

}
