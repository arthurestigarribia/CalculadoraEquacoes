package Math;

public class Logaritmo implements IEquacao {
	private double base;
	private double logaritmando;
	private double logaritmo;
	private double resultado;
	
	public Logaritmo (double base, double logaritmando, char c) {
		if (base <= 0 || base == 1) throw new IllegalArgumentException("Nao existe logaritmo com base 0 nem 1.");
		if (logaritmando <= 0) throw new IllegalArgumentException("Nao existe logaritmo com logaritmando negativo nem zero.");
		
		this.base = base;
		this.logaritmando = logaritmando;
		this.logaritmo = Math.log(logaritmando)/Math.log(base);
		
		resultado = logaritmo;
	}
	
	public Logaritmo (double base, char c, double logaritmo) {
		if (base <= 0 || base == 1) throw new IllegalArgumentException("Nao existe logaritmo com base 0 nem 1.");
		
		this.base = base;
		this.logaritmando = Math.pow(base, logaritmo);
		this.logaritmo = logaritmo;
		
		resultado = logaritmando;
	}
	
	public Logaritmo (char c, double logaritmando, double logaritmo) {
		if (logaritmando <= 0) throw new IllegalArgumentException("Nao existe logaritmo com logaritmando negativo nem zero.");
		
		this.base = Math.pow(logaritmo, 1/logaritmando);
		this.logaritmando = logaritmando;
		this.logaritmo = logaritmo;
		
		resultado = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLogaritmando() {
		return logaritmando;
	}

	public void setLogaritmando(double logaritmando) {
		this.logaritmando = logaritmando;
	}

	public double getLogaritmo() {
		return logaritmo;
	}

	public void setLogaritmo(double logaritmo) {
		this.logaritmo = logaritmo;
	}
	
	public double resolveEquacao() {
		return resultado;
	}
	
	public String toString () {
		return "x = " + resolveEquacao();
	}
}