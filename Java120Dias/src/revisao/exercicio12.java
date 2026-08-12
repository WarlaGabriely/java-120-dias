package revisao;

import java.util.Scanner;

//Leia dois números. Informe qual é o maior.
public class exercicio12 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("numero maior: " + num1);
		} else {
			System.out.println("numero maior: " + num2);
		}
		
		sc.close();
	
	}
}
