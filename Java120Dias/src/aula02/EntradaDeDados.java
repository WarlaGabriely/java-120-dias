package aula02;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome;
		String empresa;
		int idade;
		double salario;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Empresa: ");
		empresa = sc.nextLine();
		
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		System.out.print("Salário: ");
		salario = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println("Nome: " + nome);
		System.out.println("Empresa: " + empresa);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		 
		
		
		sc.close();
		
	}
}
