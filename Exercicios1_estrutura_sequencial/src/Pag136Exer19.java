/* 
19. Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e
positivos, um par de cada vez, e que calcule e mostre a soma de todos os números inteiros entre m e n 
(inclusive). A digitação de pares terminará quando m for maior ou igual a n
*/
import java.util.Scanner;

public class Pag136Exer19 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			int numero_M = 0, numero_N = 0, soma = 0, controle = 0;
			
			do {
			System.out.println("Digite o primeiro numero inteiro e positivo:");
			numero_M = scan.nextInt();
			System.out.println("Digite o segundo numero inteiro e positivo:");
			numero_N = scan.nextInt();
			soma = 0;
			if (numero_M < numero_N) {
				
				controle = numero_M;
				
				while (controle <= numero_N) {
					
					soma += controle;
					controle += 1;
					
				}
			System.out.println ("A soma de todos os numeros inteiro é:" + soma)	;
			}else {
				
			System.out.println("Programa Finalizado:");
			}
			
			}while(numero_M < numero_N);
			
			scan.close();
	}

}
