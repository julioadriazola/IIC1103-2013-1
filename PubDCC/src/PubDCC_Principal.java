import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import iic1103.*;


public class PubDCC_Principal {

	public static void main(String[] args) throws FileNotFoundException {
		InputOutput io=new InputOutput();
		//Ruta absoluta para windows: "C:\\carpeta1\\..."
		//Ruta absoluta otros OS: "/carpeta1/carpeta2/..."
		
		
		String ruta="input.txt";
		
		
		
		
		//Creación de archivo
		File myfile=new File(ruta);

		
		
		if(myfile.exists()){ //Esto para ver si el archivo existe
			
			
			//Creación del lector
			Scanner lector=new Scanner(myfile);
			int numberOfLines=0;
			
			//Contamos las líneas y las guardamos en "numberOfLines"
			while(lector.hasNextLine())
			{
				lector.nextLine();
				numberOfLines++;
			}
			
			//Cerramos y abrimos nuevamente el scanner, puesto que es una lectura secuencial
			lector.close();
			lector=new Scanner(myfile);
			
			Persona[] personas=new Persona[numberOfLines];
			
			
			
			
			//Agregamos a todas las personas
			int it=0;
			while(lector.hasNextLine())
			{
				String line=lector.nextLine();
				personas[it++]=new Persona(line);
			}
			//IMPORTANTE: si abro lector, cierro lector.
			lector.close();
			
			
			//Ordenamos el arreglo según nombre de la persona
			for(int i=0;i<personas.length-1;i++)
			{
				for(int j=0;j<personas.length-i-1;j++)
				{
					//A.compareTo(B) hace una comparación lexicográfica entre A y B, perfecto para orden alfabético
					//Si A.compareTo(B) > 0, entonces A > B (lexicográficamente)
					//Si A.compareTo(B) = 0, entonces A = B (lexicográficamente)
					//Si A.compareTo(B) < 0, entonces A < B (lexicográficamente)
					if(personas[j].getName().compareTo(personas[j+1].getName())>0)
					{
						Persona tmp= personas[j];
						personas[j]=personas[j+1];
						personas[j+1]=tmp;
					}
				}
			}
			
			int cantHombres=0;
			int cantMujeres=0;
			int[] rangoEtareo={0,0,0,0,0,0,0};
			int conCover=0;
			int conDscto=0;
			//Estamos asumiendo que las edades van de 17 a 23, entonces rE[0] corresponde a 17, etc.
			for (int i=0; i< personas.length; i++)
			{
				if(personas[i].isMan()) cantHombres++;
				else cantMujeres++;
				
				rangoEtareo[personas[i].getEdad()-17]++;
				
				conCover=personas[i].conCover()? conCover+1 : conCover;
				/*
				 * Es lo mismo que decir
				 * if(personas[i].conCover()) conCover=conCover+1;
				 * else conCover=conCover;
				 */
				conDscto=personas[i].conDscto()? conDscto+1 : conDscto;
			}
			
			
			
			//En printme están las personas
			String printme="";
			for(int i=0;i<personas.length;i++)
			{
				printme+="\n"+i+" - "+personas[i].show()+"\n";
			}
			
			
			
			io.muestraEnConsola(printme);
			
			
			
			
			//String para las estadísticas
			String stats="------Estadísticas------\n"
					+"\nNumero de Hombres: "+cantHombres
					+"\nNumero de Mujeres: "+cantMujeres
					+"\nRangos etareos:\n";
			for(int i=0;i<rangoEtareo.length;i++){
				stats+="\t"+(i+17)+": "+rangoEtareo[i]+" Personas\n";
			}
			stats+="Personas con descuento: "+conDscto
					+"\nPersonas con cover: "+conCover;
			
			
			
			io.muestra(stats);
		}
		else
		{
			io.muestra("File not found");
		}
		
		
				
	}

}
