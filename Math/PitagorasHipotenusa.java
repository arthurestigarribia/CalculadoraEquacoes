package Math;

public class PitagorasHipotenusa {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	
	public PitagorasHipotenusa (double ca, double co) {
		hipotenusa = Math.sqrt(ca * ca + co * co);
		catetoAdjacente = ca;
		catetoOposto = co;
	}
	
	public String toString () {
		return "x^2 = " + catetoAdjacente + "^2 + " + catetoOposto + "^2";
	}
	
	public String resolveEquacao () {
		return "x = " + hipotenusa;
	}
}