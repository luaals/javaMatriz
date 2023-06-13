package pcgExercício4;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] vetor = new double[10];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		vetor[0] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[1] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[2] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[3] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[4] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[5] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[6] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[7] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[8] = entrada.nextDouble();
		System.out.println("Informe um número: ");
		vetor[9] = entrada.nextDouble();
		
		
		System.out.println("A ordem inversa é: ");
		System.out.println(vetor[9]);
		System.out.println(vetor[8]);
		System.out.println(vetor[7]);
		System.out.println(vetor[6]);
		System.out.println(vetor[5]);
		System.out.println(vetor[4]);
		System.out.println(vetor[3]);
		System.out.println(vetor[2]);
		System.out.println(vetor[1]);
		System.out.println(vetor[0]);
		
	}

}
