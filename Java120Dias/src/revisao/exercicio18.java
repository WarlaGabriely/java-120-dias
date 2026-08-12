package revisao;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		
		
		switch (opcao) {

		case 1:
			System.out.println("Cadastrar");
			break;

		case 2:
			System.out.println("Alterar");
			break;

		case 3:
			System.out.println("Excluir");
			break;

		case 4:
			System.out.println("Sair");
			break;

		default:
			System.out.println("Opção inválida");
		}
	    
	    		
	    		sc.close();
	    }
		
	}

