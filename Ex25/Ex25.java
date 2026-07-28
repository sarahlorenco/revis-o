package Ex25;

import java.util.Scanner;

public class Ex25 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		double preco;
		String resposta;
		double soma = 0;
		do {
			System.out.println("Digite o preço do produto");
			preco = receba.nextDouble();
			System.out.println("Deseja adicionar mais um?, digite sim ou não");
			resposta = receba.next();
			soma += preco;
			
		}
		while (!resposta.equalsIgnoreCase("não")) ;
			System.out.println(" total  = " + soma);
			
		}

}
