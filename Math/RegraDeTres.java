package Math;

public class RegraDeTres {
	private double resultado;
	private String str;
	
	public RegraDeTres (double a, double b, double c) {	
		if (a == 0 || c == 0) throw new NaoExistemRaizesException("Os denomiandores nao podem ser iguais a zero.");
		
		this.resultado = (a * b)/ c;
		
		str = "x /" + a + " = " + b + "/" + c;
	}
	
	public String toString () {
		return str;
	}
	
	public String resolveEquacao () {
		return "x = " + resultado;
	}
}