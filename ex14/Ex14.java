package ex14;

import java.util.Scanner;

public class Ex14 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		int A2;
		int B2;
		System.out.println("Digite o valor de A");
		int A = receba.nextInt();
		System.out.println("Digite o valor de B");
		int B = receba.nextInt();
		A2 = B;
		B2 = A;
		System.out.println("valor de A invertido : " + A2  +  "\nvalor de B invertido : " + B2);

}}
