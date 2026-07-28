package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		int valorC =0;
		System.out.println("Digite o valor de A");
		int valorA = receba.nextInt();
		System.out.println(" Digite o valor de B");
		int valorB = receba.nextInt();
		
		if(valorA==valorB) {
			valorC = (valorA+valorB);
		}else {
			valorC = (valorA*valorB);
		}
			System.out.println(" cálculo = " + valorC);
		}

}
