package ex04;

import java.util.Scanner;

public class ex04 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite um número");
		int num = receba.nextInt();
		
		System.out.println("sucessor = " + (num+1) + "\n antecessor = " + (num-1));

}}
