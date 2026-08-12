package revisao;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		
		String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
		
		System.out.println(resultado);
		sc.close();
	}
}
