package Math;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		
		scanner = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1. Equacao do primeiro grau");
		System.out.println("2. Equacao do segundo grau");
		System.out.println("3. Equacao exponenial");
		System.out.println("4. Equacao logaritmica");
		System.out.println("5. Equacao trigonometrica");
		System.out.println("6. Regra de tres");
		
		int tipo = scanner.nextInt();
		

		switch (tipo) {
		case 1:
			EquacaoPrimeiroGrau eq1 = new EquacaoPrimeiroGrau(2, 12);
			System.out.println(eq1);
			break;
			
		case 2:
			new EquacaoSegundoGrau();
			break;
		
		case 3:
			Exponencial eq4 = new Exponencial(2, 'x', 8);
			System.out.println(eq4);

			break;
			
		case 4:
			Logaritmo eq6 = new Logaritmo(2, 8,'x');
			System.out.println(eq6);
			break;
			
		case 5:
			Pitagoras eq5 = new Pitagoras ('x', 3, 4);
			System.out.println(eq5);
			break;
			
		case 6:
			RegraDeTres eq3 = new RegraDeTres('a', 2, 5, 8);
			System.out.println(eq3);
			break;
		default:
			
			break;
		}

	}
	
}
