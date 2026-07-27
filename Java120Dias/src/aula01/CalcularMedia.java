package aula01;

import java.util.Locale;
import java.util.Scanner;

public class CalcularMedia {

	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("Digite o primeiro número");
		 num1 = sc.nextDouble();
			System.out.println("Digite o segundo número");
		 num2 = sc.nextDouble();
		 
		 double media = (num1 + num2) / 2.0;
		 System.out.printf(" A média de %.2f e %.2f é %.2f%n", num1, num2, media);
		 
		 
		 
	}
}
