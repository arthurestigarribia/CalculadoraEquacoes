package Math;

public class Main {
	public static void main(String[] args) {
		EquacaoPrimeiroGrau eq1 = new EquacaoPrimeiroGrau(2, 12);
		System.out.println(eq1);
		
		EquacaoSegundoGrau eq2 = new EquacaoSegundoGrau(1, -6, 8);
		System.out.println(eq2);
		
		RegraDeTres eq3 = new RegraDeTres('a', 2, 5, 8);
		System.out.println(eq3);
		
		Exponencial eq4 = new Exponencial(2, 'x', 8);
		System.out.println(eq4);
		
		Pitagoras eq5 = new Pitagoras ('x', 3, 4);
		System.out.println(eq5);
		
		Logaritmo eq6 = new Logaritmo(2, 8,'x');
		System.out.println(eq6);
	}
}