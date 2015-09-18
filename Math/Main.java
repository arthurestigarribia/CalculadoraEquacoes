package Math;

public class Main {
	public static void main(String[] args) throws DivisaoPorZeroException {
		EquacaoPrimeiroGrau eq1 = new EquacaoPrimeiroGrau(2.0, 12.0);
		System.out.println(eq1.resolveEquacao());
		
		EquacaoSegundoGrau eq2 = new EquacaoSegundoGrau(1.0, -6.0, 8.0);
		System.out.println(eq2.resolveEquacao());
		
		RegraDeTres eq3 = new RegraDeTres("a", 2, 5, 8);
		System.out.println(eq3.resolveEquacao());
		
		Exponencial eq4 = new Exponencial(2, 8);
		System.out.println(eq4.resolveEquacao());
		
		PitagorasHipotenusa eq5 = new PitagorasHipotenusa ("x", 3, 4);
		System.out.println(eq5.resolveEquacao());
		
		Logaritmo eq6 = new Logaritmo(2, 8);
		System.out.println(eq6.resolveEquacao());
	}
}