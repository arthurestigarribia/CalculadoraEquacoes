package math;

public class Exponencial implements IEquacao {
	private double base;
	private double resultado;
	
	public Exponencial (double base, double resultado) {
		if (base < 0 || base == 1 || resultado < 0) throw new NaoExistemRaizesException
			("O logaritmando e a base devem ser positivos e a base diferente de 1.");
		
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

	@Override
	public String passoAPasso() {
		return "x = log(" + resultado + ")/log(" + base + ")";
	}
}