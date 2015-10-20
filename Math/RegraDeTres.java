package Math;

public class RegraDeTres implements IEquacao {
	private double a, b, c, resultado;
	
	public RegraDeTres (double a, double b, double c) {		
		if (a == 0 || c == 0) throw new NaoExistemRaizesException("Os denomiandores nao podem ser iguais a zero.");
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.resultado = (a * b)/ c;
	}
	
	public String toString () {
		return "x /" + a + " = " + b + "/" + c;
	}
	
	public String resolveEquacao () {
		return "x = " + resultado;
	}
	
	public String passoAPasso () {
		return "x = (" + a + " * " + b + ")/(" + c + ")";
	}
}