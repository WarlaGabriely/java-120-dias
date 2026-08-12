package revisao;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char letra = sc.next().charAt(0);
		
		
		switch (letra) {
		case 'A':
			System.out.println("Excelente");
			break;
		case 'B':
			System.out.println("Bom");
		    break;
		case 'C':
			System.out.println("Regular");
			break;
		case 'D':
			System.out.println("Ruim");
		    break;
		    default:
		    	System.out.println("Invalido");
		}
		
		 sc.close();
		 
	}
}
