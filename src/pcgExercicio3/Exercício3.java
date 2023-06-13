package pcgExercicio3;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[5];
		int aux = 0;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {

			System.out.println("digite o valor: ");

			vetor[i] = entrada.nextInt();

		}

		for (int i = 0; i < 5; i++) {

			aux = (aux + vetor[i]);
		}
		System.out.println("A média dos valores é: " + (aux / 5));
		
		for (int i = 0; i < 5; i++) {
		if  (vetor[i] > aux/5) 
			System.out.println("Os valores que são maiores que a média são: "+ vetor[i]);}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			if  (vetor[i] < aux/5) 
				System.out.println("Os valores que são menores que a média são: "+ vetor[i]);}

	}
}

