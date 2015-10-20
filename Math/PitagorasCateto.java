package Math;

public class PitagorasCateto implements IEquacao {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	
	public PitagorasCateto (double h, double co) {
		hipotenusa = h;
		catetoAdjacente = Math.sqrt(h * h - co * co);
		catetoOposto = co;
	}
	
	public String toString () {
		return hipotenusa + "^2 = x^2 + " + catetoOposto + "^2";
	}
	
	public String resolveEquacao () {
		if ((hipotenusa * hipotenusa - catetoOposto * catetoOposto) < 0) throw new NaoExistemRaizesException("Nao existem raizes reais.");
		return "x = " + catetoAdjacente;
	}
	
	public String passoAPasso () {
		return "x^2 = (" + hipotenusa + ")^2 - (" + catetoOposto + ")^2";
	}
}