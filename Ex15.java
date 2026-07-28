package ex15;

import java.util.Scanner;

public class Ex15 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Insira valor de lado A");
		int A = receba.nextInt();
		System.out.println("Insira valor de lado B");
		int B = receba.nextInt();
		System.out.println("Insira valor de lado C");
		int C = receba.nextInt();
		
		if (A==B && A==C && B==C) {
			System.out.println(" O triangulo é equilátero");
		}else if (A!=B && A!=C && B!=C) {
			System.out.println("O triangulo é escaleno");
		}else {
			System.out.println("O triangulo é isósceles");
		}
			
		}

}
