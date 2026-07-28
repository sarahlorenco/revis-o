package ex11;

import java.util.Scanner;

public class Ex11 {
	public static void main (String [] args) {
		Scanner receba = new Scanner (System.in);
		System.out.println("Digite o nome do aluno");
		String nome = receba.nextLine();
		System.out.println("Digite nota 1");
		int nota1= receba.nextInt();
		System.out.println("Digite nota 2");
		int nota2 = receba.nextInt();
		System.out.println("Digite nota 3 ");
		int nota3 = receba.nextInt();
		System.out.println("Digite nota 4");
		int nota4 = receba.nextInt();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		if(media>=7) {
			System.out.println(" o aluno " + nome + "está aprovado");
		}else {
			System.out.println(" o aluno " + nome + "está reprovado");
		}
			
		}
		
		

}
