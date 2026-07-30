package Ex19;

import java.util.Scanner;

public class Ex19 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		System.out.println("Digite um número");
		int num = receba.nextInt();
		int result = 0;
		System.out.println(" TABUADA DO " + num);
		for(int i = 0; i<11; i++) {
			result = num * i;
			System.out.println(num + " X " + i + " = " + result);
			

}}}
