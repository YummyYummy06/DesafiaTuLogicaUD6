package ejemplosTemario;

public class Ejemplo17 {
	
	
	
	public static void main(String[] args)
	{
		
		
		String cadena1="Hola";
		
		String cadena2="hola";
		
		String cadena3="Hola";
		
		//Comparación de cadenas usando equals()
		
		
		//false
		boolean primeraComparacion = cadena1.equals(cadena2);
		
		//true
		boolean segundaComparacion = cadena1.equals(cadena3);
		
		System.out.println("Es la cadena1 igual a la cadena2?"+ primeraComparacion);
		
		System.out.println("Es la cadena1 igual a la cadena3?"+ segundaComparacion);
		
	}
	
	

}


