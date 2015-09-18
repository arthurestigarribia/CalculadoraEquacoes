package Math;

public class PitagorasHipotenusa {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	
	public PitagorasHipotenusa (String h, double ca, double co) {
		hipotenusa = Math.sqrt(ca * ca + co * co);
		catetoAdjacente = ca;
		catetoOposto = co;
	}
	
	public String resolveEquacao () {
		return "x = " + hipotenusa;
	}
}