package Math;

public class Logaritmo implements IEquacao {
	private double base;
	private double logaritmando;
	private double logaritmo;
	
	public Logaritmo (double base, double logaritmando) {
		if (base < 0 || base == 1 || logaritmando < 0) throw new NaoExistemRaizesException
			("O logaritmando e a base devem ser positivos e a base diferente de 1.");
		
		this.base = base;
		this.logaritmando = logaritmando;
		this.logaritmo = Math.log(logaritmando)/Math.log(base);
	}
	
	public String resolveEquacao () {
		return "x = " + logaritmo;
	}
	
	public String toString () {
		return "log_" + base + "^" + logaritmando + "= x";
	}

	@Override
	public String passoAPasso() {
		return "x = log(" + logaritmando + ")/log(" + base + ")";
	}
}