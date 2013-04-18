
public class LuchaMedieval {

	public static void main(String[] args) {

		int turno=0;
		int cantidadDeJugadores=2;
		while(haceAlgo())
		{
			if(turno==0)
			{
				//Jugador 1
			}
			else if(turno==1)
			{
				//Jugador 2
			}
			
			
			turno=(turno+1)%cantidadDeJugadores;
		}
		
	}
	
	public static boolean haceAlgo()
	{
		return true;
	}
}
