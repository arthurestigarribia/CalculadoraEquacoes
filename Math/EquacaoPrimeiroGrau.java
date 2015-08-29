package Math;

public class EquacaoPrimeiroGrau implements IEquacao {
	private double a, b;
	
	public EquacaoPrimeiroGrau (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public EquacaoPrimeiroGrau (double a) {
		this.a = a;
		this.b = 0;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public double resolveEquacao () {
		if (a == 0) throw new IllegalArgumentException("Impossivel dividir por zero.");
		return -b/a;
	}
	
	public String toString () {
		return "x = " + resolveEquacao();
	}
}