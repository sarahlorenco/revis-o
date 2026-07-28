package Ex24;

import java.util.Scanner;

public class Ex24 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		System.out.println("Digite a cotação do dólar");
		double cot = receba.nextDouble();
		System.out.println("Digite o valor em dólar");
		double dolar = receba.nextDouble();
		
		double real = dolar * cot;
		
		System.out.println(" valor em real = " + real);
		
		

}}
