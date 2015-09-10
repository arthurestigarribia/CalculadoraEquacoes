package Math;

public class Pitagoras {
	private double hipotenusa;
	private double catetoAdjacente;
	private double catetoOposto;
	private double resultado;
	private String incognita;
	
	public Pitagoras (double h, double ca, String co) {
		hipotenusa = h;
		catetoAdjacente = ca;
		catetoOposto = Math.sqrt(h * h - ca * ca);
		
		resultado = catetoOposto;
		incognita = co;
	}
	
	public Pitagoras (double h, String ca, double co) {
		hipotenusa = h;
		catetoAdjacente = Math.sqrt(h * h - co * co);
		catetoOposto = co;
		
		resultado = catetoAdjacente;
		incognita = ca;
	}
	
	public Pitagoras (String h, double ca, double co) {
		hipotenusa = Math.sqrt(ca * ca + co * co);
		catetoAdjacente = ca;
		catetoOposto = co;
		
		resultado = hipotenusa;
		incognita = h;
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
	
	public String resolveEquacao () {
		return incognita + " = " + resultado;
	}
}