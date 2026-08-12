package revisao;

import java.util.Scanner;

//Leia um número.
//Informe se ele é positivo ou negativo.

public class exercicio09 {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
	    
		if (numero >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		
			sc.close();
	
	
	}
}
}
