package Ex31;

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
	public static void main ( String [] args) {
		Random rnd = new Random ();
		int x = rnd.nextInt(100);
		Scanner receba = new Scanner (System.in);
		int num = -1;
		
		while (num !=x) {
			System.out.println("Digite um numero");
			num = receba.nextInt();
			if( num <x ) {
				System.out.println("Maior");
			}else if (num>x) {
				System.out.println("Menor");
			}
		}
		System.out.println("Acertou");
	}

}
