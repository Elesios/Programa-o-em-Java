import java.util.Scanner;
/*
 * Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números 
primos e suas respectivas posições
 */
public class Pag159Exer01 {

	public static void main(String[] args) {
		
		final int tam = 9;
		int num[] = new int[tam];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nDigite 9 numeros:");
		
		for(int i = 0; i < tam; i++) {
			// Preenche o vetor com os números digitados pelo usuário
			System.out.printf("\nDigite %d numeros:", i + 1);
			num[i] = scan.nextInt();		
		
		} 
			for(int i = 0; i < tam; i++) {
				
				boolean ehPrimo = true; // Assume que o número é primo
				if (num[i] <= 1) {
					ehPrimo = false;
				}else {
					for(int j = 2; j <= Math.sqrt(num[i]); j++) {
						if(num[i] % j == 0) {
							ehPrimo = false;
							break;
						}
					}
				}
			if(ehPrimo) {
				System.out.printf("\nNumero Primo: %d - \n "
						+ "na posição: %d", num[i], i);
			}
			}
		scan.close();
	}

}
