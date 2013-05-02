import iic1103.*;

public class BitAdder {

	public static void main(String[] args) {
		InputOutput io= new InputOutput();
		String A="1001010100101010100100010010010011001";
		String B="0110101010100101010000100101001001010";
		
		String C="";
		char Cin='0';
		for(int i=0;i<A.length();i++)
		{
			char[] opActual=fullAdder(A.charAt(A.length()-1-i),B.charAt(B.length()-1-i),Cin);
			
			Cin=opActual[0];
			C=opActual[1]+C;
		}
		
		io.muestra(C);

	}
	
	
	//[1]=S,[0]=C
	public static char[] halfAdder(char A, char B)
	{
		if(A=='0' && B=='0') return new char[]{'0','0'};
		else if(A=='1' && B=='0') return new char[]{'0','1'};
		else if(A=='0' && B=='1') return new char[]{'0','1'};
		else return new char [] {'1','0'};

	}
	
	//[1]=S [0]=Cout
	public static char[] fullAdder(char A, char B, char CarryIn)
	{
		char[] PrimerHalfAdder=halfAdder(A,B);
		char[] SegundoHalfAdder=halfAdder(PrimerHalfAdder[1],CarryIn);
		return new char[] {OR(SegundoHalfAdder[0],PrimerHalfAdder[0]),SegundoHalfAdder[1]};
	}
	
	public static char OR(char A, char B)
	{
		if(A=='0'&& B=='0') return '0';
		else return '1';
	}
	
	public static String toString(char[] thestring)
	{
		String output="";
		for(int i=0; i<thestring.length;i++)
		{
			output+=thestring[i];
		}
		return output;
	}
}
