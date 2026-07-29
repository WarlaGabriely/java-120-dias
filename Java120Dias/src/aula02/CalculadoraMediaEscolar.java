package aula02;

import java.util.Scanner;

public class CalculadoraMediaEscolar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = sc.next();
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("Primeira nota de " + nome + ": " + nota1);
		System.out.println("segunda nota de " + nome + ": " + +nota2);
		System.out.println("Media: " + media);

		if (media >= 12) {
			System.out.println("Situacao: APROVADO!");
		} else {
			System.out.println("Situacao: REPROVADO!");
		}

		sc.close();
	}
}
