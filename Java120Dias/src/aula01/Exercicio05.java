package aula01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, quantidadePecas1, codigoPeca2, quantidadePecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2;
		
		System.out.println("Digite  o codigo primeira peca: ");
		codigoPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peca: ");
		quantidadePecas1 = sc.nextInt();
		System.out.println("Digite  o valor unitario da primeira peca: ");
		valorUnitarioPeca1 = sc.nextDouble();
		
		System.out.println("Digite  o codigo segunda peca: ");
		codigoPeca2 = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peca: ");
		quantidadePecas2 =sc.nextInt();
		System.out.println("Digite  o valor unitario da segunda peça: ");
		valorUnitarioPeca2 = sc.nextDouble();
		
		
		Double total = (quantidadePecas1 * valorUnitarioPeca1) + (quantidadePecas2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$%.2f%n ", total);
		
		sc.close();
	}
}
