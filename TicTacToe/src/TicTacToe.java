import iic1103.*;


public class TicTacToe {

	
	public static void main(String[] args) {
		InputOutput io=new InputOutput();
		int puntajeJugador1=0, puntajeJugador2=0;
		io.muestra("Bienvenido al gato");
		boolean seguirJugando=true;
		char[][] gato;
		char[] jugada=new char[2];
		jugada[0]='X';
		jugada[1]='O';
		int empiezaJugador=0;
		while(seguirJugando)
		{
			gato= Inicializar();
			
			//Jugar un gato
			int jugadorActual=empiezaJugador;
			while(!(juegoGanado(gato,'X')||juegoGanado(gato,'O')||juegoEmpatado(gato)))
			{
				io.muestraEnConsola(ImprimeGato(gato));
				int posX=-1,posY=-1;
				while(!jugadaValida(gato,posX,posY))
				{
					posX=io.pideUnEntero("Jugador "+jugadorActual+1+" ( Está jugando con"+jugada[jugadorActual]+" )\nIngrese posición X");
					posY=io.pideUnEntero("Jugador "+jugadorActual+1+" ( Está jugando con"+jugada[jugadorActual]+" )\nIngrese posición Y");
				}
				
				if(jugadorActual==0)
				gato[posX][posY]='X';
				if(jugadorActual==1)
				gato[posX][posY]='O';	
				jugadorActual=(jugadorActual+1)%2;
			}
			

			io.muestraEnConsola(ImprimeGato(gato));
			
			
			if(juegoGanado(gato,'X'))
				{
					puntajeJugador1++;
					io.muestra("Juego ganado por Player 1");
				}
			if(juegoGanado(gato,'O'))
			{
				puntajeJugador2++;
				io.muestra("Juego ganado por Player 2");
			}
			
			if(juegoEmpatado(gato))
			{
				io.muestra("Juego Empatado :(");
			}
			
			if(puntajeJugador1==3 || puntajeJugador2==3)
			{
				seguirJugando=false;
			}
			
			empiezaJugador=(empiezaJugador+1)%2;
		}
		
	}

	
	private static boolean juegoEmpatado(char[][] gato) {
		if(juegoGanado(gato,'X'))return false;
		if(juegoGanado(gato,'O'))return false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(gato[i][j]==' ')
				{
					return false;
				}
			}
		}
		return true;
	}


	private static boolean jugadaValida(char[][] gato, int posX, int posY)
	{
		if(posX>2 || posX<0 || posY>2 || posY < 0) 
			return false;
		
		if(gato[posX][posY]=='X' || gato[posX][posY]=='O')
		{
			return false;
		}
		
		return true;		
	}
	
	//Tenemos a los jugadores 'X' y 'O'
	private static boolean juegoGanado(char[][] gato, char Jugador) {
		
		for(int i=0;i<3;i++)
		{
			if(gato[i][0]==Jugador && gato[i][1]==Jugador && gato[i][2]==Jugador)
				return true;
			if(gato[0][i]==Jugador && gato[1][i]==Jugador && gato[2][i]==Jugador)
				return true;
		}
		
		if(gato[0][0]==Jugador && gato[1][1]==Jugador && gato[2][2]==Jugador)
			return true;
		if(gato[0][2]==Jugador && gato[1][1]==Jugador && gato[2][0]==Jugador)
			return true;
		
		
		return false;
	}

	private static char[][] Inicializar() {
		char[][] output= new char[3][3];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				output[i][j]=' ';
			}
		}
		return output;
	}

	public static String ImprimeGato(char[][] gato) {
		String output="";
		for(int i=0; i<gato.length; i++)
		{
			output+=" "+gato[i][0]+" | "+gato[i][1]+" | "+gato[i][2]+" \n";
			if(i<2)
			output+="---+---+---\n";
		}
		return output;
	}

}
