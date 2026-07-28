package ex09;

import java.util.Scanner;

public class Ex09 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		double IMC = 0;
		System.out.println(" Digite sua altura em metros");
		double altura = receba.nextDouble();
		System.out.println("Digite seu peso");
		int peso = receba.nextInt();
		
		 IMC = peso/(altura*altura);
		
		if (IMC<18.5) {
			System.out.println("Abaixo do peso");
		}else if (IMC<25.0) {
			System.out.println("Peso ideal parabéns");
		}else if ( IMC<30.0) {
			System.out.println("levemente acima do peso");
		}else if ( IMC<35.0) {
			System.out.println("obesidade grau I");
		}else if (IMC<40.0) {
			System.out.println("obesidade grau II");
		}else {
			System.out.println("obesidade grau III");
		}
	receba.close();
}}
			
		


