package ex12;

import java.util.Scanner;

public class Ex12 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		double valortotal = 0;
		System.out.println("Digite o valor do produto");
		double preco = receba.nextDouble();
		System.out.println("FORMA DE PAGAMENTO");
		System.out.println("1- dinheiro ou pix");
		System.out.println("2- cartão");
		System.out.println("escolha a forma de pagamento");
		int pagamento = receba.nextInt();
		
		switch (pagamento) {
		case 1 :
			valortotal = preco - (0.15*preco);
			break;
		case 2:
			System.out.println("O pagamento será : 1- a vista 2- parcelado em 2x 3- mais");
			int parcela = receba.nextInt();
			if (parcela == 1) {
				valortotal = preco - (0.10*preco);
				
			}else if (parcela == 2) {
				valortotal = preco;
			}else if (parcela == 3) {
				valortotal = (0.10*preco)+preco;
			}
		}
		System.out.println("O valor final do produto é de " + valortotal);
		
		}

}
