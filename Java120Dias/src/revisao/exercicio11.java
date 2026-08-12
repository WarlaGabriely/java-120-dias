package revisao;

import java.util.Scanner;

//Leia a nota de um aluno. Se nota ≥ 7: Aprovado
//Caso contrário: Reprovado

public class exercicio11 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota = sc.nextInt();	
	
		if(nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	
	}
}
