package Math;

public class EquacaoBase implements IEquacao {
	private double expoente;
	private double potencia;
	
	public EquacaoBase (double expoente, double potencia) {
		if (expoente == 0) throw new NumberFormatException();
		
		this.expoente = expoente;
		this.potencia = potencia;
	}
	
	@Override
	public String resolveEquacao() {
		double resp = Math.pow(potencia, 1/expoente);
		
		return "x = " + resp;
	}
	
	public String toString() {
		return "x ^ " + expoente + " = " + potencia;
	}
}