package Math;

public class EquacaoSegundoGrau {
	private double a, b, c, d;
	
	public EquacaoSegundoGrau (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public EquacaoSegundoGrau (double a, double b) {
		this.a = a;
		this.b = b;
		this.c = 0;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
	public double[] resolveEquacao () {
		if (a == 0) throw new IllegalArgumentException("O termo a nao pode ser igual a zero.");
		
		double d = Math.pow(b, 2) - 4*a*c;
		double [] resp = new double[2];
		
		if (d >= 0) {	
			resp[0] = (-b + Math.sqrt(d))/(2*a);
			resp[1] = (-b - Math.sqrt(d))/(2*a);
		} else {
			System.out.println("Nao existem raizes reais. ");
		}
		
		
		return resp;
	}
	
	public String toString() {
		if (d >= 0) return "x1 = " +  resolveEquacao()[0] + " | x2 = " + resolveEquacao()[1];
		return "Nao existem raizes reais.";
	}
}