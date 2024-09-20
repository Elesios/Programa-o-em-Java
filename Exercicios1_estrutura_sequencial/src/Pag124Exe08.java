/*8. Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série
a seguir:
Série = 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...*/

import java.util.Scanner;

public class Pag124Exe08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero_termos, num1 = 2, num2 = 7, num3 = 3;
		
		System.out.println("Digite o numero de Termos:");
		numero_termos = scan.nextInt();
		
		System.out.printf("%d - %d - %d - ", num1, num2, num3);
		
		for (int i = 0; i != numero_termos; i++) {
			num1 = num1 * 2;
			num2 = num2 * 3;
			num3 = num3 *4;
			System.out.printf("%d - %d - %d - ", num1, num2, num3);
		}
		
		scan.close();
	}

}
