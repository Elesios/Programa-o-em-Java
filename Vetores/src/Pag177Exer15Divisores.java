import java.util.*;

public class Pag177Exer15Divisores {

public static void main(String[] args) {
		
		
		int num[] = new int[10];
		int num2[] = new int[5];
		
		Random rand = new Random();
				
		for(int i = 0; i < 10; i++) {
			// Preenche o vetor com 10 numeros inteiros
			num[i] = rand.nextInt(50);	
			} 
		for(int i = 0; i < 5; i++) {
			// Preenche o vetor com 5 numeros inteiros
			num2[i] = rand.nextInt(10);		
		}
		
		System.out.println();
		System.out.println("NNumero Vetor 1 e posição"); 
		for(int i = 0; i < 10; i++) {
			System.out.printf("|%d| -", num[i]);
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.printf("|0%d| -", i);
		}							
		System.out.println();
		System.out.println("Numero Vetor 2 e posição:"); 
		for(int i = 0; i < 5; i++) {
			System.out.printf("|%d| -", num2[i]);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.printf("|%d| -", i);
		}	
				
			
		
	}

}
