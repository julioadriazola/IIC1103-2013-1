import iic1103.*;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	InputOutput io=new InputOutput();
	GeneradorAleatorio random= new GeneradorAleatorio();
	
	String nombre, enfermedad, grupo;
	int edad, presion, valorConsulta;
	boolean tieneBeneficio;
	int desc=0;
	
	nombre=io.pideUnTexto("Ingresa nombre paciente");
	
	
	edad=-1;
	
	while(!(edad>=1 && edad <=114) )
	{
		edad=io.pideUnEntero("Ingresa edad del paciente");
	}
	int opcion=-1;
	
	
	while(!(opcion==1 || opcion ==0)) //opcion!=1 && opcion != 0
	{
		opcion=io.pideUnEntero("¿Tiene beneficio?\n 0- No\n 1-Sí");
	}
	
	
	valorConsulta=random.entero(5000, 30000);
	
	
	if(opcion==1)
	{
		io.muestra("Nombre: "+nombre+"\nEdad: "+edad+"\nValor " +
				"Real: " +
				"$"+valorConsulta+"\nValor con Desc: $"+(valorConsulta*(100-15)/100));
	}
	else if(opcion==0)
	{
		io.muestra("Nombre: "+nombre+"\nEdad: "+edad+"\nValor " +
				"Real: " +
				"$"+valorConsulta);
	
	}
	

		
	}
	
	
	
		
	}	
		

