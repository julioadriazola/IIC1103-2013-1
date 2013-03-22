import iic1103.*;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputOutput io=new InputOutput();
		
		int año_persona= io.pideUnEntero("Ingresa el año en que naciste");
		int tu_edad=2013-año_persona;
		
		io.muestra("Tu edad es: "+tu_edad);
		

	}

}
