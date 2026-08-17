package projetos;

import java.util.Locale;
import java.util.Scanner;

public class SistemaDeCaixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double total = 0.0;
		int opcao = -1;

		while (opcao != 0) {
			System.out.println();
			System.out.println("=========================");
			System.out.println("====SISTEMA DE CAIXA=====");
			System.out.println("=========================");
			System.out.println("1 - Comprar");
			System.out.println("2 - Mostrar Total");
			System.out.println("3 - Calcular Troco ");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opcao: ");

			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o valor de compra: ");
				double valor = sc.nextDouble();

				total += valor;
				
				System.out.printf("Compra adicionada! Total atual: R$ %.2f%n", total);
			}
			if (opcao == 2) {
				System.out.printf("Total da compra: R$ %.2f%n", total);
			}
			if (opcao == 3) {
				System.out.println("Digite o valor pago: ");
				double valorPago = sc.nextDouble();

				int valorInteiro = (int) valorPago;

				if (valorPago >= total) {

					double troco = valorPago - total;

					System.out.printf("Troco: R$ %.2f%n", troco);
				} else {
					System.out.println("Valor insuficiente para pagar a compra.");
				}
			}
				if (opcao == 0) {
					System.out.println("Caixa encerrado.");
				}
			}
			sc.close();
		}

	}
