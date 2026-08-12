package revisao;

import java.util.Scanner;

//Leia um número.Informe se ele é:Par ou Ímpar
public class exercicio10 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();	
		
		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();
	}
}
