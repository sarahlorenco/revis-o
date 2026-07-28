package Ex26;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		int soma = 0;
		double media = 0;
		int qtd = 0;
		do {
			System.out.println("Digite um número ( se caso quiser encerrar digite -1)");
			num = receba.nextInt();
			if( num !=-1 ) {
				qtd++;
				soma += num;
				media = soma / qtd;
				
			}
			
			

		} while (num != -1);
		System.out.println(" soma = " + soma);
		System.out.println(" média = " + media);

	}
}
