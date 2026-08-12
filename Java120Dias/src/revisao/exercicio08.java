package revisao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String [] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		int numeroInteiro = (int) numero;
		
		System.out.println("Original: " + numero);
		System.out.println("Convertido para inteiro: " + numeroInteiro);
		
		sc.close();
		
		
	}
}
