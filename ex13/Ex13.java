package ex13;

import java.util.Scanner;

public class Ex13 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite seu nome");
		String nome = receba.nextLine();
		System.out.println("Digite sua idade");
		int idade = receba.nextInt();
		if(idade>=18) {
			System.out.println(nome + " atingiu a maior idade");
			
		}else {
			System.out.println(nome + " não atingiu a maior idade");
		}

}}
