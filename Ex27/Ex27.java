package Ex27;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		double salario;
		double soma = 0;
		double maior = 0;
		double menor = 100000000;

		System.out.println("Digite a quantidade de funcionários");
		int qtd = receba.nextInt();
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o salário do funcionário");
			salario = receba.nextDouble();
			soma += salario;
			if (salario > maior) {
				maior = salario;
			}
			if (salario < menor) {
				menor = salario;
			}
		}

		System.out.println(" soma =  " + soma);
		System.out.println(" maior =  " + maior);
		System.out.println(" menor =  " + menor);

	}
}
