package revisao;
import java.util.Scanner;

//Leia a idade em anos.
//calcule aproximadamente quantos dias essa pessoa viveu.


public class exercicio07 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadeReal = sc.nextInt();
		
		int dias = idadeReal * 365;
		
		double idadeDecimal = (double) dias;
		
		System.out.println("Quantidade de dias Reais " + dias);
		System.out.println("Quantidades de dias decimais " + idadeDecimal);
		
		sc.close();
	}
}
