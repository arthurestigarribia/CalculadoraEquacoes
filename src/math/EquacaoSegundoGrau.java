package math;

public class EquacaoSegundoGrau implements IEquacao {
	private double a;
	private double b;
	private double c;

	public EquacaoSegundoGrau (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public EquacaoSegundoGrau (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString () {
		if (b >= 0 && c >= 0) return a + "x^2 + " + b + "x + " + c + " = 0";
		if (b >= 0 && c <= 0) return a + "x^2 + " + b + "x - " + -c + " = 0";
		if (b <= 0 && c >= 0) return a + "x^2 - " + -b + "x + " + c + " = 0";
		return a + "x^2 - " + -b + "x - " + -c + " = 0";
	}
	
	public String resolveEquacao () {
		if (a == 0) throw new DivisaoPorZeroException("O termo a nao pode ser igual a zero.");
	
		double d = Math.round(Math.pow(b, 2) - 4*a*c);
		double [] resp = new double[2];
		
		if (d >= 0) {	
			resp[0] = Main.round((-b + Math.sqrt(d))/(2*a));
			resp[1] = Main.round((-b - Math.sqrt(d))/(2*a));
		} else {
			throw new NaoExistemRaizesException("Nao existem raizes reais. ");
		}
		
		
		return "x1 = " + resp[0] + " | x2 = " + resp[1];
	}
	
	public String passoAPasso () {
		return "x1 = [-(" + b + ") + sqrt(" + b + "^2 - 4 * " + a + " * " + c + ")]/(2 * " + a 
				+ ") | x2 = [-(" + b + ") - sqrt(" + b + "^2 - 4 * " + a + " * " + c + ")]/(2 * " + a + ")";
	}
}