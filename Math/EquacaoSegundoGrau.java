package Math;

import java.util.Scanner;

public class EquacaoSegundoGrau {
	private double a, b, c, d;
	private Scanner scanner;
	
	//receber valores de a,b,c
	public EquacaoSegundoGrau () 
	{
		scanner = new Scanner(System.in);
		
		System.out.println("aX²+bX+c");
		
		System.out.print("a:");
		this.a = scanner.nextDouble();
		
		System.out.print("b:");
		this.b = scanner.nextDouble();
		
		System.out.print("c:");
		this.c = scanner.nextDouble();
	

		//verificar se o valor de a eh zero
		if (a == 0)
		{
			System.out.println("a nao pode ser igual a zero");
		}
		else
		{
			
		//imprimir a equacao em causa
		System.out.print(a + "X²");
		if (b != 0)
		{
			if (b > 0)
			{
				System.out.print("+" + b + "X");
			}
			else
			{
				System.out.print(b + "X");
			}
		}
		
		if  (c !=0)
		{
			if (c > 0)
			{
				System.out.println("+" + c);
			}
			else
			{
				System.out.println(c);
			}
		}
		
		//imprimir delta Δ
		double d = Math.pow(b, 2) - 4*a*c;
		 System.out.println("Δ = b² - 4 * a * c");
		 System.out.println("Δ = " + b + "² - 4 * " + a + " * " + c);
		 System.out.println("Δ = " + d);
		
		if (d >= 0) {
			//imprimir formula de bhaskara
			System.out.println("X = (-b ± √Δ)/2 * a ");
			
			//resuldado
			System.out.println("X = (-" + b + " ± √" + d + ")/2 * " + a);
			System.out.println("X1 = " + (-b + Math.sqrt(d))/(2*a));
			System.out.println("X2 = " + (-b - Math.sqrt(d))/(2*a));
			
		} else {
			System.out.println("Nao tem raizes reais.");
		}
		}
	}
}
