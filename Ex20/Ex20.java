package Ex20;

import java.util.Scanner;

public class Ex20 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		System.out.println("Digite o valor de A");
		int A = receba.nextInt();
		System.out.println("Digite o valor de B");
		int B = receba.nextInt();
		double quociente = (A/B);
		int resto = (A%B);
		System.out.println("quociente = " + quociente);
		System.out.println("resto = " + resto );
		
		

}}
