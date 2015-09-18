package Math;

public class PitagorasCateto {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	
	public PitagorasCateto (double h, double co) {
		hipotenusa = h;
		catetoAdjacente = Math.sqrt(h * h - co * co);
		catetoOposto = co;
	}
	
	public String resolveEquacao () {
		return "x = " + catetoAdjacente;
	}
}