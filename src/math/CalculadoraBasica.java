package math;

public class CalculadoraBasica {
	private double a, b;
	
	public CalculadoraBasica (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public String soma () {
		return a + " + " + b  + " = " + Main.round(a + b);
	}
	
	public String subtracao () {
		return a + " - " + b  + " = " + Main.round(a - b);
	}
	
	public String multiplicacao () {
		return a + " * " + b  + " = " + Main.round(a * b);
	}
	
	public String divisao () {
		if (b != 0) return a + " / " + b  + " = " + Main.round(a / b);
		else return "Nao e possivel dividir por zero.";
	}
}