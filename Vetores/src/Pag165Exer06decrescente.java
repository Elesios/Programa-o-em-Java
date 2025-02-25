import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

/*
 * Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resul
tante de uma ordenação decrescente.
 */

public class Pag165Exer06decrescente {

	public static void main(String[] args) {
		
		final int tam = 10;
		Random rand = new Random();
		
		int[]vetor = new int[tam];
		//int[]ordem = new int[tam];
		
		for(int i = 0; i < tam ; i++) {
			vetor[i] = rand.nextInt(30) + 1;			
		}
		Arrays.sort(vetor);			
		int[] ordem = Arrays.copyOf(vetor, tam);  // Copia os valores do vetor original
		
		for (int i = 0; i < tam / 2; i++) {        // Inverte para decrescente
		    int temp = ordem[i];
		    ordem[i] = ordem[tam - 1 - i];
		    ordem[tam - 1 - i] = temp;
		}
		System.out.println("Vetores Ordem Crescente:" + Arrays.toString(vetor));
		System.out.println("Vetores Ordem decrescente:" + Arrays.toString(ordem));
	}

}
