import java.util.Random;
import java.util.Arrays;

/*
 * Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores 
resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números ne
gativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente 
utilizada
 */

public class Pag160Exer04 {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] vetor = new int[8];
		int[] vetor_positivo = new int[8];
		int[] vetor_negativo = new int[8];
		
		int pos_count = 0; // Contador para vetor_positivo
        int neg_count = 0; // Contador para vetor_negativo

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(12) - 6;

			if (vetor[i] >= 0) {
				vetor_positivo[pos_count] = vetor[i];
				 pos_count++;
			} else {
				vetor_negativo[neg_count] = vetor[i];
				 neg_count++;
			}
		}

		// Imprimindo os vetores
        System.out.println("Vetor Original: " + Arrays.toString(vetor));
        
        System.out.print("Vetores Positivos: ");
        for (int i = 0; i < pos_count; i++) {
            System.out.print(vetor_positivo[i] + " ");
        }

        System.out.print("\nVetores Negativos: ");
        for (int i = 0; i < neg_count; i++) {
            System.out.print(vetor_negativo[i] + " ");
        }

	}

}
