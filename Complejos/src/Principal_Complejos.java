import iic1103.*;
public class Principal_Complejos {

	
	public static void main(String[] args) {
		iic1103.InputOutput io= new InputOutput();
		iic1103.GeneradorAleatorio ran=new GeneradorAleatorio();
		
		Complejos A=new Complejos(0,0);
		
		int op=-1;
		while(op==0)
		{
			op=io.pideUnEntero("---MENU---" +
					"\n1-Sumar" +
					"\n2-Restar" +
					"\n3-Multiplicar por..." +
					"\n4-Dividir por..." +
					"\n5-Restablecer" +
					"\n\nOtro-Salir");
			if(op==1)
			{
				A.Sumar(new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria")));
			}
			else if(op==2)
			{
				A.Restar(new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria")));
			}
			else if(op==3)
			{
				A.Multiplicar(new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria")));
			}
			else if(op==4)
			{
				A.Dividir(new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria")));
			}
			else if(op==5)
			{
				A.Restablecer();
			}
			else
			{
				// nada
			}
			io.muestra(A.printMe());
		}
		
		
//		io.muestra("Ingrese A");
//		Complejos A=new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria"));
//		io.muestra(A.printMe());
//		io.muestra("Ingrese B");
//		Complejos B=new Complejos(io.pideUnReal("Parte Real"),io.pideUnReal("Parte Imaginaria"));
//		
//		Complejos C=  Complejos.SumaComp(A, B);	
		
	}

}
