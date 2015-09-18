package Math;

public class Logaritmo {
	private double base;
	private double logaritmando;
	private double logaritmo;
	
	public Logaritmo (double base, double logaritmando) {
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
}