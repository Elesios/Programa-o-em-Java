import java.util.Scanner;
/*
 * Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize di
gitando idade igual a zero. 
 */

public class Pag148Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade, media = 0, cont = 0;
		
		do {
			System.out.print("\nDigite varias idade:\n"
					+ "para encerrar digite 0:");
			idade = scan.nextInt();
			media += idade;
			cont++;
		}while (idade != 0);
		media = media / cont;
		
		System.out.print("\n--------------");
		System.out.print("\nResultados");
		System.out.printf("\nMedia das idades: %d", media);
	}

}
