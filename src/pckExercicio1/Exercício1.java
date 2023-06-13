package pckExercicio1;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		Scanner entrada = new Scanner(System.in);
		/*

		System.out.println("Informe o primeiro número da linha 1: ");
		matriz[0][0] = entrada.nextInt();
		System.out.println("Informe o segundo número da linha 1: ");
		matriz[0][1] = entrada.nextInt();
		System.out.println("Informe o terceiro número da linha 1: ");
		matriz[0][2] = entrada.nextInt();
		System.out.println("Informe o primeiro número da linha 2: ");
		matriz[1][0] = entrada.nextInt();
		System.out.println("Informe o segundo número da linha 2: ");
		matriz[1][1] = entrada.nextInt();
		System.out.println("Informe o terceiro número da linha 2: ");
		matriz[1][2] = entrada.nextInt();
		System.out.println("Informe o primeiro número da linha 3: ");
		matriz[2][0] = entrada.nextInt();
		System.out.println("Informe o segundo número da linha 3: ");
		matriz[2][1] = entrada.nextInt();
		System.out.println("Informe o terceiro número da linha 3: ");
		matriz[2][2] = entrada.nextInt();*/
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Informe um numero: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("| " + matriz[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}

}
