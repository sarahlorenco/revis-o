package Ex28;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int mult = 0;
		System.out.println("Digite um número");
		int num1 = receba.nextInt();
		System.out.println("Digite um número");
		int num2 = receba.nextInt();
		
		for(int i = 0; i<num1; i++) {
			mult += num2;
		}
		System.out.println(num1 + "*" + num2 + " = " + mult);
			
		}

}
