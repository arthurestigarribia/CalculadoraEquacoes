package Math;

public class EquacaoPrimeiroGrau {
	private double a;
	private double b;
	
	public EquacaoPrimeiroGrau (double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public String toString () {
		if (b >= 0) return a + "x + " + b + " = 0";
		return a + "x - " + -b + " = 0";
	}
	
	public String resolveEquacao () throws DivisaoPorZeroException {
		if (a == 0) throw new DivisaoPorZeroException("Impossivel dividir por zero.");
		return "x = " + -b/a;
	}
}