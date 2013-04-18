
public class Jinete {
	String _name;
	double _des,_hp,_str;
	
	Espada _espada=null;
	Armadura _armor=null;
	Escudo _shell=null;
	Corcel _caballo=null;
	
	public Espada get_espada() {
		return _espada;
	}

	public void set_espada(Espada _espada) {
		this._espada = _espada;
	}

	public Armadura get_armor() {
		return _armor;
	}

	public void set_armor(Armadura _armor) {
		this._armor = _armor;
	}

	public Escudo get_shell() {
		return _shell;
	}

	public void set_shell(Escudo _shell) {
		this._shell = _shell;
	}

	public Corcel get_caballo() {
		return _caballo;
	}

	public void set_caballo(Corcel _caballo) {
		this._caballo = _caballo;
	}

	
	
	public Jinete(String name, double hp, double str)
	{
		_name=name;
		_des=Math.random();
		_hp=hp;
		_str=str;
	}
	
	public void ponerArmadura(Armadura armor)
	{
		_armor=armor;
	}
	
	public void atacarEscudo(Jinete Rival)
	{
		Rival.recibirAtaque(this, "Escudo");
	}
	
	public void atacarArmadura(Jinete Rival)
	{
		Rival.recibirAtaque(this, "Armadura");
	}
	
	public void atacarCaballo(Jinete Rival)
	{
		//Una lógica
	}
	
	public void defender(Jinete Rival)
	{
		
	}
	
	public boolean perdioBatalla()
	{
		return _hp<=0 || _caballo.get_hp()<=0;
	}
	
	public void recibirAtaque(Jinete Rival,String tipoDeAtaque)
	{
		if(Math.random()>Rival.get_des())
		{
			double dmg= Rival.get_caballo().get_vel()*1.12+Rival.get_str()+Rival.get_espada().get_poder();
			Rival.get_espada().disminuirDurabilidad(dmg/20);
			//if tipoDeAtaque=="Armadura"
			if (tipoDeAtaque.equals("Armadura"))
			{
				dmg-=get_armor().get_def();
				get_armor().disminuirDurabilidad(dmg/15);
			}
			else if (tipoDeAtaque.equals("Escudo"))
			{
				
				dmg-=get_shell().get_def();
				get_shell().disminuirDurabilidad(dmg/10);
			}
			
			
			
		}
	}

	public double get_des() {
		return _des;
	}

	public double get_str() {
		return _str;
	}
	
}
