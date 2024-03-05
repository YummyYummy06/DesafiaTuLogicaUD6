package ejemplosTemario;

import java.time.LocalTime;

public class RelojAlarma extends Reloj {
	
	LocalTime hora = LocalTime.now();
	
	//Estoy creando una subclase de reloj que se llame RelojAlarma para que funcione el Ejemplo2
	
	public RelojAlarma(int horas, int mins, int segs)
	{
		super(horas,mins,segs);
		
		LocalTime alarma = LocalTime.of(0,0);
		
		
		
	}
	
	public String toString() {
        return "Hora: " + hora.toString();
	}
	


}
