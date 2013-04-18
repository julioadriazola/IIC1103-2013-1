
public class Espada {
	private double _alcance=0,_poder=0,_durabilidad=0;
	
	public Espada(double alcance, double poder, double durabilidad)
	{
		_alcance=alcance;
		_poder=poder;
		_durabilidad=durabilidad;
	}

	public double get_alcance() {
		return _alcance;
	}

	public double get_poder() {
		return _poder;
	}

	public double get_durabilidad() {
		return _durabilidad;
	}
	
	public void disminuirDurabilidad(double cantidad)
	{
		_durabilidad-=cantidad;
	}
	
}
