package Math;

public class Exponencial implements IEquacao {
	private double base;
	private double expoente;
	private double potencia;
	private double resultado;
	private char incognita;
	
	public Exponencial (double base, char c, double potencia) {
		this.base = base;
		this.expoente = Math.log(potencia)/Math.log(base);
		this.potencia = potencia;
		this.resultado = this.expoente;
		this.incognita = c;
	}
	
	public Exponencial (double base, double expoente, char c) {
		this.base = base;
		this.expoente = expoente;
		this.potencia = Math.pow(base,  expoente);
		this.resultado = potencia;
		this.incognita = c;
	}
	
	public Exponencial (char c, double expoente, double potencia) {
		this.base = Math.pow(potencia, 1/expoente);
		this.expoente = expoente;
		this.potencia = potencia;
		this.resultado = base;
		this.incognita = c;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getExpoente() {
		return expoente;
	}

	public void setExpoente(double expoente) {
		this.expoente = expoente;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public double resolveEquacao() {
		return resultado;
	}
	
	public String toString () {
		return incognita + " = " + resolveEquacao();
	}
}