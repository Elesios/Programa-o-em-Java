import java.util.Scanner;
import java.util.Random;
	/*
	 *  Faça um programa que receba dez números, calcule e mostre a soma dos números pares e a soma dos 
		números primos. 
	 */
public class Pag148Exer10 {

	public static void main(String[] args) {
		
		final int tam = 10;
		Random rand = new Random();
		int num, soma_par = 0, soma_primo = 0, soma_impar = 0;
		
		for(int i = 0; i < tam ; i++) {
			num = rand.nextInt(100);
			System.out.print("\n-------------");
			System.out.printf("\nNumero: %d", num);
			
			if(num % 2 == 0) {
				soma_par += num;
			}else {
				soma_impar += num;
			}
			boolean ehPrimo = true; // Assume que o número é primo
			if (num <= 1) {
				ehPrimo = false; // Números menores ou iguais a 1 não são primos
			}else {
				for (int j = 2; j < num; j++) {
					if (num % j == 0) {
						ehPrimo = false;  // Se for divisível por algum número, não é primo
						break;
					}
				}
			}
			if(ehPrimo) {
				soma_primo += num;
			}
		}
		System.out.printf("\nResultados:");
		System.out.printf("\nSoma dos numeros pares: %d", soma_par);
		System.out.printf("\nSoma dos numeros impares: %d", soma_impar);
		System.out.printf("\nSoma dos numeros primos: %d", soma_primo);
	}

}
