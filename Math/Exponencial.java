package Math;

public class Exponencial {
	private double base;
	private double resultado;
	
	public Exponencial (double base, double resultado) {
		this.base = base;
		this.resultado = resultado;
	}
	
	public String toString () {
		return base + "^x = " + resultado;
	}
	
	public String resolveEquacao () {
		if (base == 1 || base <= 0) throw new IllegalArgumentException("O valor da base deve ser positivo e diferente de 1.");
		
		Logaritmo log = new Logaritmo(base, resultado); 
		
		return log.resolveEquacao();
	}
}