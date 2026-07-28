package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite um numero");
		int num = receba.nextInt();
		if(num%2==0) {
			System.out.println(" o número é par");
		}else {
			System.out.println(" o número é ímpar");
		}
		if (num<0) {
			System.out.println(" o número é negativo");
		}else if (num==0) {
			System.out.println("o número é neutro");
		}else {
			System.out.println("o número é positivo");
		}

	}}
