package Math;

public class Fracao {
	public Object numerador;
	public Object denominador;
	
	public Fracao (Object a, Object b) {
		if ((double)b == 0) throw new DivisaoPorZeroException("Impossivel dividir por zero.");
		
		numerador = a;
		denominador = b;
	}
	
	public double getResultado () {
		return (double)numerador / (double)denominador;
	}
	
	public double getQuociente () {
		return (int)((double)numerador / (double)denominador);
	}
	
	public double getResto () {
		return (double)numerador % (double)denominador;
	}
}