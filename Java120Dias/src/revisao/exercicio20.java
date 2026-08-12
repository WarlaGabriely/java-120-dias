package revisao;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		String resultado = numero >= 0 ? "Positivo" : "Negativo";
		
		System.out.println(resultado);
		
		sc.close();
		
		
	}
}
