package revisao;

import java.util.Scanner;

//Leia: idade. Informe: se é Menor de idade ou Maior de idade
public class exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}

		sc.close();
	}
}
