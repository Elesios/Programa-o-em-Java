import java.util.Scanner;


public class Pag148Exer01 {

	public static void main(String[] args) {
	/*1. Faça um programa que leia cinco grupos de quatro valores (A, B, C, D) e mostre-os na ordem lida. Em seguida, organize-os em ordem crescente e decrescente.
	*/
		float A=0, B=0, C=0, D=0; // Grupo de quarto valores.
		Scanner scan = new Scanner(System.in); //linha de codico para entrda de dados
		
		
		System.out.println("\nDigite o primeiro Grupo de Numeros, quatro valores.");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite o 5 Grupo de 4 valores.");
			
			for(int j = 0; j < 4; j ++) {
				
				if (j == 0) {
					System.out.println("Digite um valor:");
					A = scan.nextFloat();
					}else if (j == 1) {
						System.out.println("Digite um valor:");
						B = scan.nextFloat();										
						}else if(j == 2) {
							System.out.println("Digite um valor:");
							C = scan.nextFloat();
							}else if (j == 3) {
								System.out.println("Digite um valor:");
								D = scan.nextFloat();
								}					
			
			}
			
			System.out.println("\nOs Numeros Digitados sao:");
			System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,B, C, D);
			
				if((A < B) && (A < C) && (A < D)) {
					if ((B < C) && (B < D)) {
						if (C < D) {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,B, C, D);											
						}else {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,B, D, C);				
						}
					}else if ((C < B) && (C < D)) {
						if (B < D) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,C, B, D);
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,C, D, B);
						}
						
					}else {
						if (B < C) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,D, B, C );
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,D, C, B);
						}
					}
				
				}
				if((B < A) && (B < C) && (B < D)) {
					if ((A < C) && (A < D)) {
						if (C < D) {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,A, C, D);											
						}else {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,A, D, C);				
						}
					}else if ((C < A) && (C < D)) {
						if (A < D) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,C, A, D);
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,C, D, A);
						}
						
					}else {
						if (A < C) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,D, A, C );
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,D, C, A);
						}
					}
				
				}		
				if((C < A) && (C < B) && (C < D)) {
					if ((A < B) && (A < D)) {
						if (B < D) {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,A, B, D);											
						}else {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,A, D, B);				
						}
					}else if ((C < A) && (C < D)) {
						if (A < D) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,B, A, D);
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,B, D, A);
						}
						
					}else {
						if (A < B) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,D, A, B );
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,D, B, A);
						}
					}
				
				}
				if((D < A) && (D < B) && (D < C)) {
					if ((A < B) && (A < C)) {
						if (B < D) {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,A, B, C);											
						}else {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,A, C, B);				
						}
					}else if ((C < A) && (C < D)) {
						if (A < C) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,B, A, C);
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,B, C, A);
						}
						
					}else {
						if (A < B) {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,C, A, B );
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,C, B, A);
						}
					}
				
				}	
				if((A > B) && (A > C) && (A > D)) {
					if ((B > C) && (B > D)) {
						if (C > D) {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,B, C, D);											
						}else {
						System.out.println("\nA Ordem Crescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,B, D, C);				
						}
					}else if ((C > B) && (C > D)) {
						if (B > D) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,C, B, D);
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,C, D, B);
						}
						
					}else {
						if (B > C) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,D, B, C );
						}else {
							System.out.println("\nA Ordem Crescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", A ,D, C, B);
						}
					}
				
				}
				if((B > A) && (B > C) && (B > D)) {
					if ((A > C) && (A > D)) {
						if (C > D) {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,A, C, D);											
						}else {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,A, D, C);				
						}
					}else if ((C > A) && (C > D)) {
						if (A > D) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,C, A, D);
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,C, D, A);
						}
						
					}else {
						if (A > C) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,D, A, C );
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", B ,D, C, A);
						}
					}
				
				}		
				if((C > A) && (C > B) && (C > D)) {
					if ((A > B) && (A > D)) {
						if (B > D) {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,A, B, D);											
						}else {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,A, D, B);				
						}
					}else if ((C > A) && (C > D)) {
						if (A > D) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,B, A, D);
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,B, D, A);
						}
						
					}else {
						if (A > B) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,D, A, B );
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", C ,D, B, A);
						}
					}
				
				}
				if((D > A) && (D > B) && (D > C)) {
					if ((A > B) && (A > C)) {
						if (B > D) {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,A, B, C);											
						}else {
						System.out.println("\nA Ordem Descrescente:");
						System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,A, C, B);				
						}
					}else if ((C > A) && (C > D)) {
						if (A > C) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,B, A, C);
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,B, C, A);
						}
						
					}else {
						if (A > B) {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,C, A, B );
						}else {
							System.out.println("\nA Ordem Descrescente:");
							System.out.printf("%f - ,%f - ,%f - ,%f - ", D ,C, B, A);
						}
					}
				
				}
			
			
		}
		
		
		
		
	}

}
