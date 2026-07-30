package Ex21;

import java.util.Scanner;

public class Ex21 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		System.out.println("Insira o valor da hora por aula");
		double horaaula =  receba.nextDouble();
		System.out.println("Insira o número de aulas");
		int numero = receba.nextInt();
		double aliquota = 0;
		double parcela = 0;
		
		double salariobruto = numero * horaaula;
		if (salariobruto<1621.00) {
			aliquota = 0.075;
		}else if (salariobruto<2902.84){
			aliquota = 0.09;
			parcela = 24.32;
		}else if(salariobruto<4354.27) {
			aliquota = 0.12;
			parcela = 111.40;
		}else if(salariobruto<8475.55) {
			aliquota = 0.14;
			parcela = 198.49;
		}
		double desconto =( salariobruto*aliquota) - parcela;
		double salariofinal = salariobruto - desconto;
		System.out.println(" salario bruto = " + salariobruto);
		System.out.println(" Desconto INSS = " + desconto);
		System.out.println(" salario líquido = " + salariofinal);
		}
	
		
		}


