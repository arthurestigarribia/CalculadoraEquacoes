package Math;

public class RegraDeTres {
	private Fracao f1, f2;
	private double resultado;
	private String incognita;
	
	public RegraDeTres (String a, double b, double c, double d) {	
		f1.denominador = b;
		f2.numerador = c;
		f2.denominador = d;
		
		this.resultado = (b * c)/ d;
		this.incognita = a;
	}
	
	public RegraDeTres (double a, String b, double c, double d) {
		f1.numerador = a;
		f2.numerador = c;
		f2.denominador = d;
		
		this.resultado = (a * d)/ c;
		this.incognita = b;
	}
	
	public RegraDeTres (double a, double b, String c, double d) {
		f1.numerador = a;
		f1.denominador = b;
		f2.denominador = d;
		
		this.resultado = (a * d)/ b;
		this.incognita = c;
	}
	
	public RegraDeTres (double a, double b, double c, String d) {
		f1.numerador = a;
		f1.denominador = b;
		f2.numerador = c;
		
		this.resultado = (b * c)/ a;
		this.incognita = d;
	}
	
	public String toString () {
		return f1.numerador + "/" + f1.denominador + " = " + f2.numerador + "/" + f2.denominador;
	}
	
	public String resolveEquacao () {
		return incognita + " = " + resultado;
	}
}