
public class Corcel {
	private String _nombre;
	private double _hp,_vel;
	
	public Corcel(String nombre, double hp, double vel)
	{
		_nombre=nombre;
		_hp=hp;
		_vel=vel;
	}

	public double get_hp() {
		return _hp;
	}
	
	public double get_vel(){
		return _vel;
	}
}
