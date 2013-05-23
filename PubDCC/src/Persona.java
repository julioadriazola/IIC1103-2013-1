
public class Persona {
//Nombre, edad, sexo, rut, información acerca de si pago cover
//	y si es que estaba o no en una lista de descuento

	private int _edad;
	private String _rut, _name;
	
	private boolean _cover, _dscto, _isMan;
	
	public Persona(String linea)
	{
		String[] atributos= linea.split(";");
		_rut=atributos[0];
		_name=atributos[1];
		_edad=Integer.parseInt(atributos[2]);
		_isMan=atributos[3].charAt(0)=='M';
		_cover= atributos[4].charAt(0)=='c';
		/*
		 Es lo mismo que...
		 if(atributos[3].charAt(0)=='c')
		 	_cover=true;
		 else
		 	_cover=false;
		 */
		_dscto= atributos[5].charAt(0)=='c';
	}
	
	public Persona(int edad, String rut, String name, boolean cover, boolean dscto)
	{
		_edad=edad;
		_rut=rut;
		_name=name;
		_cover=cover;
		_dscto=dscto;
	}
	
	
	
	public String getName() {
		return _name;
	}

	public String show() {
		return _name + "\n\t" + _edad + "\n\t"+_rut;//.... 
	}
	
	public boolean isMan(){
		return _isMan;
	}
	
	public int getEdad(){
		return _edad;
	}
	
	public boolean conCover(){
		return _cover;
	}
	
	public boolean conDscto(){
		return _dscto;
	}
	
}
