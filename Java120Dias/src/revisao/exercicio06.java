package revisao;
import java.util.Scanner;

//Leia um número double.
//Mostre apenas sua parte inteira usando casting.

public class exercicio06 {

	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();	
		int inteiro = (int) numero;
		
		
		System.out.println(inteiro);
		
				
		sc.close();
	}
	
	
}


