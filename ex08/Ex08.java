package ex08;

import java.util.Scanner;

public class Ex08 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		int num1;
		int num2;
		int num3;
		int maior=0;
		int menor = 0;
		int intermediario =0;
		System.out.println("Digite um valor");
		num1 = receba.nextInt();
		System.out.println("Digite um valor diferente do anterior");
		num2 = receba.nextInt();
		System.out.println("Digite um valor diferente do anterior");
		num3 = receba.nextInt();
		
		if (num1>num2 && num1>num3) {
			maior = num1;
		} else if (num1<num2 && num1<num3) {
			menor = num1;
		}else {
			intermediario = num1;
		}
		if (num2>num1 && num2>num3) {
			maior = num2;
		} else if (num2<num1 && num2<num3) {
			menor = num2;
		}else {
			intermediario = num2;
		}
		if (num3>num2 && num3>num1) {
			maior = num3;
		} else if (num3<num2 && num3<num1) {
			menor = num3;
		}else {
			intermediario = num3;
		}
			System.out.println(menor);
			System.out.println(intermediario);
			System.out.println(maior);
		}

}
