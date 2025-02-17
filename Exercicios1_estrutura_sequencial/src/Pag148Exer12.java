
import java.util.Scanner;
import java.util.Random;
	/*
	 *  Faça um programa que receba dez números inteiros e mostre a quantidade de números primos dentre os 
		números que foram digitados. . 
	 */
public class Pag148Exer12 {

	public static void main(String[] args) {
		
		final int tam = 10;
		Random rand = new Random();
		int num, soma_par = 0, soma_primo = 0, soma_impar = 0;
		
		for(int i = 0; i < tam ; i++) {
			num = rand.nextInt(30);
			System.out.print("\n-------------");
			System.out.printf("\nNumero: %d", num);
			
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
				soma_primo ++;
			}
		}
		System.out.printf("\nResultados:");
		System.out.printf("\nNumeros primos: %d", soma_primo);
	}

}