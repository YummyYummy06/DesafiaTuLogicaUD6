package retoUD6;

import java.time.*;

public class Jugador {
	
	String nombre,arma,habitacion;
	LocalTime horaPartida;
	
	
	
	//Constructor
	
	
	public Jugador(String nombre, String arma, String habitacion, LocalTime horaPartida)
	{
		this.nombre = nombre;
		this.arma = arma;
		this.habitacion = habitacion;
		this.horaPartida = horaPartida;
	}
	
	//Getters y Setters
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getArma()
	{
		return arma;
	}
	
	public String getHabitación()
	{
		return habitacion;
	}
	
	public LocalTime getHoraPartida()
	{
		return horaPartida;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setArma(String arma)
	{
		this.arma=arma;
	}
	
	public void setHabitacion(String habitacion)
	{
		this.habitacion = habitacion;
	}
	
	public void setHoraPartida(LocalTime horaPartida)
	{
		this.horaPartida = horaPartida;
	}

}


