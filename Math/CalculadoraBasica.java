package math;

public class CalculadoraBasica {
	private double a, b;
	
	public CalculadoraBasica (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public String soma () {
		return a + " + " + b  + " = " + (a + b);
	}
	
	public String subtracao () {
		return a + " - " + b  + " = " + (a - b);
	}
	
	public String multiplicacao () {
		return a + " * " + b  + " = " + (a * b);
	}
	
	public String divisao () {
		return a + " / " + b  + " = " + (a / b);
	}
}