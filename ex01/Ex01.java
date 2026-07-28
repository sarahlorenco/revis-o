package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		int soma = 0;
		System.out.println("Digite o valor de A");
		int valorA = receba.nextInt();
		System.out.println("Digite o valor de B");
		int valorB = receba.nextInt();
		System.out.println("Digite o valor de C");
		int valorC=receba.nextInt();
		
		soma = (valorA + valorB);
		System.out.println(" Soma = " + soma);
		if(soma<valorC) {
			System.out.println("  A soma é menor que o valor de C");
		
		}else {
			System.out.println("A soma é maior que o valor de C");
		}
		
		
	}

}
