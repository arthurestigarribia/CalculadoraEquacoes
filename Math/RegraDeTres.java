package Math;

public class RegraDeTres {
	private double extremo1, meio1, meio2, extremo2, resultado;
	private char incognita;
	
	public RegraDeTres (char extremo1, double meio1, double meio2, double extremo2) {
		this.extremo1 = (meio1 * meio2)/extremo2;
		this.meio1 = meio1;
		this.meio2 = meio2;
		this.extremo2 = extremo2;
		
		this.resultado = this.extremo1;
		incognita = extremo1;
	}
	
	public RegraDeTres (double extremo1, char meio1, double meio2, double extremo2) {
		this.extremo1 = extremo1;
		this.meio1 = (extremo1 *extremo2)/meio2;
		this.meio2 = meio2;
		this.extremo2 = extremo2;
		
		this.resultado = this.meio1;
		incognita = meio1;
	}
	
	public RegraDeTres (double extremo1, double meio1, char meio2, double extremo2) {
		this.extremo1 = extremo1;
		this.meio1 = meio1;
		this.meio2 = (extremo1*extremo2)/meio1;
		this.extremo2 = extremo2;
		
		this.resultado = this.meio2;
		incognita = meio2;
	}
	
	public RegraDeTres (double extremo1, double meio1, double meio2, char extremo2) {
		this.extremo1 = extremo1;
		this.meio1 = meio1;
		this.meio2 = meio2;
		this.extremo2 = (meio1 * meio2)/extremo1;
		
		this.resultado = this.extremo2;
		incognita = extremo2;
	}

	public double getExtremo1() {
		return extremo1;
	}

	public void setExtremo1(double extremo1) {
		this.extremo1 = extremo1;
	}

	public double getMeio1() {
		return meio1;
	}

	public void setMeio1(double meio1) {
		this.meio1 = meio1;
	}

	public double getMeio2() {
		return meio2;
	}

	public void setMeio2(double meio2) {
		this.meio2 = meio2;
	}

	public double getExtremo2() {
		return extremo2;
	}

	public void setExtremo2(double extremo2) {
		this.extremo2 = extremo2;
	}
	
	public double resolveEquacao() {
		return resultado;
	}
	
	public String toString () {
		return incognita + " = " + resultado;
	}
}