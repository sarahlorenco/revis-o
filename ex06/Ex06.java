package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		int num = receba.nextInt();
		
		double reajuste = (num + (0.05*num));
		System.out.println(" valor ajustado = " + reajuste);

}}
