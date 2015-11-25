package math;

public class EquacaoBase implements IEquacao {
	private double expoente;
	private double potencia;
	
	public EquacaoBase (double expoente, double potencia) {
		if (expoente == 0) throw new NaoExistemRaizesException("O expoente nao pode ser igual a zero.");
		
		this.expoente = expoente;
		this.potencia = potencia;
	}
	
	@Override
	public String resolveEquacao() {
		double resp = Main.round(Math.pow(potencia, 1/expoente));
		
		if (expoente % 2 == 0 && potencia >= 0) return "x1 = " + resp + " | x2 = " + -resp;
		if (expoente % 2 == 0 && potencia < 0) return "Nao existem raizes reais.";
		return "x = " + resp;
	}
	
	public String toString() {
		return "x ^ " + expoente + " = " + potencia;
	}

	@Override
	public String passoAPasso() {
		return "x1 = (" + potencia + ")^(1/" + expoente + ")";
	}
}