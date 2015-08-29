package Math;

public class Pitagoras implements IEquacao {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	private double resultado;
	
	public Pitagoras (char h, double ca, double co) {
		if (co < 0 || ca < 0) throw new IllegalArgumentException("Nao existem numeros negativos na Geometria Plana.");
		
		hipotenusa = Math.sqrt(ca * ca + co * co);
		catetoAdjacente = ca;
		catetoOposto = co;
		
		resultado = hipotenusa;
	}
	
	public Pitagoras (double h, double ca, char co) {
		if (h < 0 || ca < 0) throw new IllegalArgumentException("Nao existem numeros negativos na Geometria Plana.");
		
		hipotenusa = h;
		catetoAdjacente = ca;
		catetoOposto = Math.sqrt(h * h - ca * ca);
		
		resultado = catetoOposto;
	}
	
	public Pitagoras (double h, char ca, double co) {
		if (h < 0 || co < 0) throw new IllegalArgumentException("Nao existem numeros negativos na Geometria Plana.");
		
		hipotenusa = h;
		catetoAdjacente = Math.sqrt(h * h - co * co);
		catetoOposto = co;
		
		resultado = catetoAdjacente;
	}
	
	public double getHipotenusa () {
		return hipotenusa;
	}
	
	public double getCatetoOposto () {
		return catetoOposto;
	}
	
	public double getCatetoAdjacente () {
		return catetoAdjacente;
	}
	
	public double resolveEquacao() {
		return resultado;
	}
	
	public String toString () {
		return "x = " + resolveEquacao();
	}
}
