package projetos;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = -1;
		

		while (opcao != 0) {
			System.out.println("====MENU====");
			System.out.println("1 - Calcular IMC");
			System.out.println("2 - Ver tabela");
			System.out.println("0 - Sair");

			System.out.println("Escolha uma opcao: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite seu nome: ");
				String nome = sc.next();

				System.out.print("Digite seu peso: ");
				double peso = sc.nextDouble();

				System.out.print("Digite sua altura: ");
				double altura = sc.nextDouble();

				if (peso > 0 && altura > 0) {
					double imc = peso / (altura * altura);
					
					System.out.println(nome + " Seu IMC é: " + imc + "kg/m^2.");
			
					if (imc < 18.5) {
						System.out.println("Voce esta abaixo do peso.");
						} else if (imc <= 24.9) {
						System.out.println("Voce esta com o peso normal.");
					} else if (imc < 29.9) {
						System.out.println(" Voce esta com sobrepeso.");
					} else  {
						System.out.println(" Voce esta com obesidade.");					
					} 	
				} else {
					 System.out.println("Peso ou altura inválidos!");
				}
				break;			
			case 2:
				System.out.println("=================TABELA=================");
				System.out.println("|Abaixo do peso | IMC < 18,5           |");
				System.out.println("|Peso normal    | IMC entre 18,5 e 24,9|");
				System.out.println("|Sobrepeso      | IMC entre 25 e 29,9  |");
				System.out.println("|Obesidade      |IMC ≥ 30              |");
				System.out.println("========================================");
				break;
			case 0:
			    System.out.println("Sistema encerrado!");
			   break;
			
			default:
				System.out.println("Opcao invalida!");
              break;
			}
		}
			
			sc.close();
		}
		
	}



