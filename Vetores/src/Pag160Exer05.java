import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

/*
		 * Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre 
	 		seguintes vetores resultantes:
 			
		 */
		
public class Pag160Exer05 {
	public static void main(String[] args) {
		
		final int tam = 10;
		Random rand = new Random();
		int cont=0;
		int[] vetor_x = new int[tam];
		int[] vetor_y = new int[tam];
		int[] vetor_soma = new int[tam];
		int[] vetor_Produto = new int[tam];
		//int[] vetor_diferenca = new int[tam];
		
		//Usamos HashSet<Integer>, que não permite elementos repetidos.
		Set<Integer> vetor_uniao = new HashSet<>();
		Set<Integer> vetor_diferenca  = new HashSet<>();
		Set<Integer> vetor_igual  = new HashSet<>();
		
		for(int i = 0; i < tam ; i++) {
			vetor_x[i] = rand.nextInt(30) + 1;
			vetor_y[i] = rand.nextInt(30) + 1;	
			vetor_soma[i] =  vetor_x[i] + vetor_y[i];
			vetor_Produto[i] =  vetor_x[i] * vetor_y[i];
		}
		
		System.out.println("Vetor 1: " + Arrays.toString(vetor_x));
		System.out.println("Vetor 2: " + Arrays.toString(vetor_y));
		System.out.println("Soma:    " + Arrays.toString(vetor_soma));
		System.out.println("Produto: " + Arrays.toString(vetor_Produto));
		System.out.println("-------------------------------------");
		Arrays.sort(vetor_x);
		System.out.println("Vetor 1: " + Arrays.toString(vetor_x));
		
		Arrays.sort(vetor_y);
		System.out.println("Vetor 2: " + Arrays.toString(vetor_y));		
		System.out.println("-------------------------------------");
		// A união de X com Y  (todos os elementos de X e de Y sem repetições). 000000000000000000000000000000000000000
		for(int num : vetor_x) {			
			vetor_uniao.add(num);
		}
		for(int num : vetor_y) {
			vetor_uniao.add(num);
		}
		//A diferença entre X e Y (todos os elementos de X que não existam em Y, sem repetições).
		  
		for(int i = 0; i < tam ; i++) {
			boolean existeNoY = false; // Flag para verificar se o elemento de vetor_x existe em vetor_y
			
			// Verificar se o elemento vetor_x[i] existe em vetor_y
			for(int j = 0; j < tam ; j++) {
			if(vetor_x[i] == vetor_y[j]) {
				vetor_igual.add(vetor_x[i]);
				existeNoY = true;
	            break; // Se encontrou, não precisa mais verificar os outros elementos de vetor_y
				}
			}
			if(!existeNoY) {
				vetor_diferenca.add(vetor_x[i]);
				
			}
		}
		
		//System.out.println("Diferença entre X e Y: " + Arrays.toString(Arrays.copyOf(vetor_diferenca, cont)));
		System.out.println("Diferença nos elementos: " + vetor_diferenca);
		System.out.println("Diferença nos elementos: " + vetor_igual);
		Set<Integer> vetor_ordenado = new TreeSet<>(vetor_uniao);
		
		
		System.out.println("União dos vetores: " + vetor_uniao);
		System.out.println("Vetores Ordenado: " + vetor_ordenado);
		//System.out.println("Diferença nos elementos: " + Arrays.toString(vetor_diferenca));
	}	
}
