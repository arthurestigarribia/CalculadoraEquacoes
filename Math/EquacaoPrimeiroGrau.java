package math;

public class EquacaoPrimeiroGrau implements IEquacao {
	private double a;
	private double b;
	
	public EquacaoPrimeiroGrau (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString () {
		if (b >= 0) return a + "x + " + b + " = 0";
		return a + "x - " + -b + " = 0";
	}
	
	public String resolveEquacao () {
		if (b == 0) throw new DivisaoPorZeroException("Impossivel dividir por zero.");
		return "x = " + Main.round(-b/a);
	}
	
	public String passoAPasso () {
		return "x = -(" + b + ")/(" + a + ")";
	}
}