package projetos;
import java.util.Scanner;
public class verificadorTurno {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Digite a hora (0 a 23) :");
		hora = sc.nextInt();
		
		if(hora <= 12) {
			System.out.println("Manhã");
		}
		else if (hora <= 18) {
			 System.out.println("Tarde");
		 }
		else if(hora <= 23){
			System.out.println("Noite");
		} else {
			System.out.println("Opcao invalida!");
			sc.close();
		}
	}
	
}
