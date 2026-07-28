package ex10;

import java.util.Scanner;

public class Ex10 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite nota 1");
		int nota1= receba.nextInt();
		System.out.println("Digite nota 2");
		int nota2= receba.nextInt();
		System.out.println("Digite nota 3");
		int nota3= receba.nextInt();
		
		double media = (nota1+nota2+nota3)/3;
		System.out.println(" a média é = " + media);

}}
