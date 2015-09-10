package Math;

public class Logaritmo {
	private double base;
	private double logaritmando;
	private double logaritmo;
	private double resultado;
	private String incognita;
	
	public Logaritmo (double base, double logaritmando, String logaritmo) {
		this.base = base;
		this.logaritmando = logaritmando;
		this.logaritmo = Math.log(logaritmando)/Math.log(base);
		
		this.resultado = this.logaritmo;
		this.incognita = logaritmo;
	}
	
	public Logaritmo (double base, String logaritmando, double logaritmo) {
		this.base = base;
		this.logaritmando = Math.pow(base, logaritmo);
		this.logaritmo = logaritmo;
		
		this.resultado = this.logaritmando;
		this.incognita = logaritmando;
	}
	
	public Logaritmo (String base, double logaritmando, double logaritmo) {
		this.base = Math.pow(logaritmando, 1/logaritmo);
		this.logaritmando = logaritmando;
		this.logaritmo = logaritmo;
		
		this.resultado = this.base;
		this.incognita = base;
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
	
	public String resolveEquacao () {
		return incognita + " = " + resultado;
	}
}