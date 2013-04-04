
public class Principal {


	public static void main(String[] args) {

	Avion avion=new Avion(300,1500);
	
	avion.subirPasajeros(157);
	avion.llenarEstanque();
	avion.bajarPasajeros(10);
	avion.mostrarInfo();
		
//			¿Cómo hacer un menú?
//			Onda...
//			1- Cantar
//			2- Bailar
//			3- Saltar
//			
//			0-Salir
		
//		La forma fácil...
//		
//		Damos una opción inválida
//		 opción 2-->op=0;
//		while(true) // opción 2-->while(op!=0)
//		{
//			op=io.pedirEntero("Ingrese opcion\n" +
//					"1- Cantar\n2- Bailar\n3- Saltar\n\n0-Salir");
//			if(op==1)
//			{
//				//Aquí hacemos que cante
//			}
//			else if(op==2)
//			{
//				//Aquí hacemos que salte
//			}
//			.
//			.
//			.
//			else if(op==0)
//			{
//				break;
//			}
//				
//			
//		}
//		}
		
			
	}

}
