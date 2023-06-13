package pkcExercício6;

import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int SomaImpar = 0, aux = 0;
		int[] soma = new int[5];
		int[] soma2 = new int[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Informe um numero: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println("Matriz:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("| " + matriz[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (matriz[i][j] % 2 != 0) {
					SomaImpar = matriz[i][j];
					aux += matriz[i][j];
				}
			}
		}
		System.out.println(" ");
		System.out.println("A soma dos números ímpares é: " + aux);
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				soma[j] += matriz[i][j];
			}
		}
		for (int j = 0; j < 5; j++) {
			System.out.println("Coluna " + (j + 1) + ": " + soma[j]);
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				soma2[i] += matriz[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Linha " + (i + 1) + ": " + soma2[i]);
		}

	}
}