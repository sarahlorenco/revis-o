package ex16;

import java.util.Scanner;

public class Ex16 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite a temperatura em Fahrenheit");
		int F = receba.nextInt();
		int C = (5 * ( F-32) / 9);
		System.out.println("A temperatura em Celsius é : "  + C);
}}
