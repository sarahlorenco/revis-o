package Ex22;

import java.util.Scanner;

public class Ex22 {
	public static void main ( String [] args) {
		Scanner receba = new Scanner ( System.in);
		System.out.println("Insira a velocidade média");
		int velocidademedia = receba.nextInt();
		System.out.println("Insira o tempo");
		int tempo = receba.nextInt();
		
		int distancia = tempo * velocidademedia;
		int litros = distancia/12;
		System.out.println(" tempo  = " + tempo);
		System.out.println(" velocidade média  = " + velocidademedia);
		System.out.println(" distância = " + distancia);
		System.out.println(" quantidade de litros = " + litros);
}}
