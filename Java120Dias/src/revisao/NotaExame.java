package revisao;
import java.util.Locale;
import java.util.Scanner;

public class NotaExame {
	 
	    public static void main(String[] args) {
	     Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);
	 
	     double N1 = sc.nextDouble();
	     double N2 = sc.nextDouble();
	     double N3 = sc.nextDouble();
	     double N4 = sc.nextDouble();
	     
	     double notaExame = 0;
	     
	     double somaPesos = (N1 * 2) +(N2 * 3) + (N3 * 4) + (N4 * 1);
	     double media = somaPesos / 10;
	     
	     System.out.println("Media:" + media);
	     
	     if (media >= 7.0) {
	         System.out.println("Aluno aprovado.");
	     }
	     else if (media < 5.0) {
	         System.out.println("Aluno reprovado.");
	     }
	     else {
	         System.out.println("Aluno em exame.");
	         notaExame = sc.nextDouble();
	         System.out.println("Nota do exame: ");
	         double mediaFinal = notaExame + media / 2;
	         if(mediaFinal >= 5) {
	             System.out.println("Aluno aprovado.");
	         } else {
	             System.out.println("Aluno reprovado.");
	             System.out.println("Media final: " + mediaFinal);
	         }
	         sc.close();
	         
	     }
	    }
	 
	}

