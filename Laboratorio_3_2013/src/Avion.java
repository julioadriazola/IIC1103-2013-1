import iic1103.*;
public class Avion {

	private int _cantPasajeros, _cantAsientos;
	private double _combustible, _maxCombustible;
	private double _distanciaAcumulada=0;
	public static InputOutput io=new InputOutput();
	
	public Avion(int cantAsientos, double maxCombustible)
	{
		_cantPasajeros=0;
		_cantAsientos=cantAsientos;
		_combustible=0;
		_maxCombustible=maxCombustible;
	}
	
	public void avanzarDistancia(double dist)
	{
		_distanciaAcumulada+=dist;
	}
	
	
	//Este método nos dice si se puede avanzar una distancia d o no
	//Ojo que no está programado el metodo, háganlo ustedes
	public boolean sePuedeAvanzarDistancia(double d)
	{
		return true;
	}
	
	public void subirPasajeros(int cantidad)
	{
		if(cantidad > _cantAsientos + _cantPasajeros)
		{
			io.muestra("No hay capacidad suficiente.\n" +
					"Se quedaron"+(cantidad-_cantAsientos - _cantPasajeros)
					+"Pasajeros afuera");
			_cantPasajeros=_cantAsientos;
		}
		else
		{
			_cantPasajeros+=cantidad;
		}
	}
	
	public void bajarPasajeros(int cantidad)
	{
		if (_cantPasajeros-cantidad<0)
		{
			_cantPasajeros=0;
		}
		else
		{
			_cantPasajeros-=cantidad;
		}
	}
	
	public void llenarEstanque()
	{
		_combustible=_maxCombustible;
	}
	
	public void mostrarInfo()
	{
		io.muestra("Cantidad de pasajeros: "+_cantPasajeros
				+"\nCapacidad avion: "+_cantAsientos+"\nCombustible"
				+_combustible+"\netc...");
	}
}