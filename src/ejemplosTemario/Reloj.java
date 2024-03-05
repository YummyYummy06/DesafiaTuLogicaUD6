package ejemplosTemario;

import java.time.LocalTime;

public class Reloj {
	
	LocalTime hora = LocalTime.now();
	
	int horas,mins,segs;
	
	
	//Estoy creando una clase Reloj para que funcione el ejemplo
	
	public Reloj(int horas,int mins, int segs)
	{
		this.horas = horas;
		this.mins = mins;
		this.segs =segs;
	}
	
	public LocalTime getHora()
	{
		return hora;
	}
	
	public void setHora(int horas,int minuto,int segundo, LocalTime hora)
	{
		this.hora = hora.of(horas, minuto, segundo);
	}
	
	public String toString() {
        return "Hora: " + hora.toString();
	}
	


}



