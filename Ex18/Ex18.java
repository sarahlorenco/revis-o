package Ex18;

import java.util.Scanner;

public class Ex18 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
				System.out.println("Digite um número");
				int num = receba.nextInt();
				int result = 0;
				System.out.println(" TABUADA DO " + num);
				for(int i = 1; i<11; i++) {
					result = num * i;
					System.out.println(num + " X " + i + " = " + result);
					
					
				}
	}

}
