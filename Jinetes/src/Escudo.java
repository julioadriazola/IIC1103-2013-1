
public class Escudo {
	private double _durabilidad,_def;
	
	public Escudo(double durab, double def)
	{
		_durabilidad=durab;
		_def=def;
	}
	
	public double get_durabilidad() {
		return _durabilidad;
	}

	public double get_def() {
		return _def;
	}
	
	public void disminuirDurabilidad(double cantidad)
	{
		_durabilidad-=cantidad;
	}
}
