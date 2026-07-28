package ex05;

import java.util.Scanner;

public class Ex05 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		int salariom = 1621;
		System.out.println("Digite o valor do salário");
		int salario =  receba.nextInt();
		
		System.out.println(" o usuario ganha  aproximadamente " + (salario/salariom) + " vezes do salário mínimo");

}}
