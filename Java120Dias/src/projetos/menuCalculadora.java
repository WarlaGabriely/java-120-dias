package projetos;

import java.util.Scanner;
import java.util.Locale;

public class menuCalculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println();

		int opcao;
		double numero1 = 0, numero2, resultado;

		System.out.println("==============================");
		System.out.println("       CALCULADORA JAVA       ");
		System.out.println("==============================");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("Sair");
		System.out.println("==============================");
		System.out.println("Escolha uma opcao: ");
		opcao = sc.nextInt();

		if (opcao == 0) {
			System.out.println("Programa encerrado");
		} else {
			System.out.println("Digite o primeiro numero: ");
			numero1 = sc.nextDouble();
		}

		System.out.println("Digite o segundo numero: ");
		numero2 = sc.nextDouble();

		switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("Resultado da soma: %.2f%n", resultado);
			break;

		case 2:
			resultado = numero1 - numero2;
			System.out.printf("Resultado da subtracao: %.2f%n", resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.printf("Resultado da multiplicacao: %.2f%n", resultado);
			break;
		case 4:

			if (numero2 == 0) {
				System.out.println("Erro! Nao é possivel dividir por zero.");
			} else {
				resultado = numero1 / numero2;
				System.out.printf("Resultado da divisao: %.2f%n", resultado);
			}
			break;
		default:
			System.out.println("Opcão invalida!");

		}
		sc.close();
	}

}
