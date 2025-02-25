/**Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene--os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições,
 *  composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.
 */

import java.util.Arrays;
import java.util.Random;


public class Pag167Exer08ordemcrescente {
	
	public static void main(String[] args) {
		
		final int tam = 5;
		final int tam10 = 10;
		Random rand = new Random();
		
		int[] vetor1 = new int[tam];
		int[] vetor2 = new int[tam];
		int[] vetortotal = new int[tam10];
		
		for(int i = 0; i < tam ; i++) {
			vetor1[i] = rand.nextInt(30) +1;
			vetor2[i] = rand.nextInt(30)+1;			
		}
		int cont = 0;
		for(int i = 0; i < vetor1.length ; i++) {
			vetortotal[cont] = vetor1[i];
			cont++;
		}
		for(int i = 0; i < vetor2.length ; i++) {
			vetortotal[cont] = vetor2[i];	
			cont++;
		}
		System.out.println("Vetor 1 e 2: " + Arrays.toString(vetortotal));
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < vetortotal.length -1 -i; j ++) {
				if(vetortotal[j] > vetortotal[j+1]) {
					int temp = vetortotal[j];
					vetortotal[j] = vetortotal[j+1];
					vetortotal[j+1] = temp;
				}
			}
		}
		System.out.println("Vetor 1 e 2: " + Arrays.toString(vetortotal));
		System.out.println("---------------------------------");
		
		System.out.println("Vetor1: " + Arrays.toString(vetor1));		
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam -1 -i; j ++) {
				if(vetor1[j] > vetor1[j+1]) {
					int temp = vetor1[j];
					vetor1[j] = vetor1[j+1];
					vetor1[j+1] = temp;
				}
			}
		}
		System.out.println("Ordem Crescente: " + Arrays.toString(vetor1));
		System.out.println("---------------------------------");
		System.out.println("Vetor1: " + Arrays.toString(vetor2));
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam -1 -i; j ++) {
				if(vetor2[j] > vetor2[j+1]) {
					int temp = vetor2[j];
					vetor2[j] = vetor2[j+1];
					vetor2[j+1] = temp;
				}
			}
		}
		System.out.println("Ordem Crescente: " + Arrays.toString(vetor2));
		
		
		
	}

}
