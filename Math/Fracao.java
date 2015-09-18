package Math;

public class Fracao {
	public double numerador;
	public double denominador;
	
	public Fracao (double a, double b) {
		if (b == 0) throw new DivisaoPorZeroException("Impossivel dividir por zero.");
		
		numerador = a;
		denominador = b;
	}
	
	public double getResultado () {
		return numerador / denominador;
	}
	
	public double getQuociente () {
		return (int)(numerador / denominador);
	}
	
	public double getResto () {
		return numerador % denominador;
	}
}