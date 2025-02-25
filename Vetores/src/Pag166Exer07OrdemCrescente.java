import java.util.Random;
import java.util.Arrays;

/*
 * Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resul
tante de uma ordenação decrescente.
 */

public class Pag166Exer07OrdemCrescente {

	public static void main(String[] args) {

		final int tam = 10;
		Random rand = new Random();

		int[] vetor = new int[tam];

		for (int i = 0; i < tam; i++) {
			vetor[i] = rand.nextInt(30) + 1;
		}
		for (int i = 0; i < tam; i++) {

			for (int j = 0; j < tam - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;

				}
			}
		}
		System.out.println("Vetores Ordem Crescente:" + Arrays.toString(vetor));

	}

}
