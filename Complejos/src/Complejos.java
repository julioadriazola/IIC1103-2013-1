
public class Complejos {
	
	private double _R,_I;
	
	public Complejos(double R, double I)
	{
		_R=R;
		_I=I;
	}

	public double getR() {
		return _R;
	}

	public double getI() {
		return _I;
	}
	
	
	// A + B
	public static Complejos SumaComp(Complejos A, Complejos B){
		double I=A.getI()+B.getI();
		double R=A.getR()+B.getR();
		return new Complejos(R,I);
	}
	
	
	// this + B
	public void Sumar(Complejos B)
	{
		_I=this.getI()+B.getI();
		_R=this.getR()+B.getR();
	}
	
	//this - B
	public void Restar(Complejos B)
	{
		_I=this.getI()-B.getI();
		_R=this.getR()-B.getR();
	}
	
	// This * B
	public void Multiplicar(Complejos B)
	{
		double a=this.getR();
		double b=this.getI();
		double c=B.getR();
		double d=B.getI();
		
		_R=(a*c-b*d);
		_I=(a*d+b*c);
	}
	
	//this / B
	public void Dividir(Complejos B)
	{
		double a=this.getR();
		double b=this.getI();
		double c=B.getR();
		double d=B.getI();
		
		_R=(a*c+b*d)/(c*c+d*d);
		_I=(b*c-a*d)/(c*c+d*d);
	}
	
	//this= 0 + 0i
	public void Restablecer()
	{
		_R=0;
		_I=0;
	}
	
	public String printMe()
	{
		if(_I<0)
		{
			return _R +""+_I+"i";
		}
		return _R+"+"+_I+"i";
	}
	
}
