package Math;

public class RegraDeTres {
	private double resultado;
	private String incognita, str;
	
	public RegraDeTres (String a, double b, double c, double d) {	
		this.resultado = (b * c)/ d;
		this.incognita = a;
		
		str = a + "/" + b + " = " + c + "/" + d;
	}
	
	public RegraDeTres (double a, String b, double c, double d) {
		this.resultado = (a * d)/ c;
		this.incognita = b;
		
		str = a + "/" + b + " = " + c + "/" + d;
	}
	
	public RegraDeTres (double a, double b, String c, double d) {
		this.resultado = (a * d)/ b;
		this.incognita = c;
		
		str = a + "/" + b + " = " + c + "/" + d;
	}
	
	public RegraDeTres (double a, double b, double c, String d) {
		this.resultado = (b * c)/ a;
		this.incognita = d;
		
		str = a + "/" + b + " = " + c + "/" + d;
	}
	
	public String toString () {
		return str;
	}
	
	public String resolveEquacao () {
		return incognita + " = " + resultado;
	}
}