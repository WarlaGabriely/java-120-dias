package aula01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double valueHours, salary;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		valueHours = sc.nextDouble();
		
	 salary = hours * valueHours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
		
		
		
		
	}
}
