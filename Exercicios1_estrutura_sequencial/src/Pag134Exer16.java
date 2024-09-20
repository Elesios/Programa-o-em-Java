//faça um programa para calcular a área de um triângulo e que não permita a entrada de dados inválidos, 
//ou seja, medidas menores ou iguais a 0.

import java.util.Scanner;

public class Pag134Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float base,altura, area;
		
		System.out.println("Digite a Base do Triangulo, que seja maior que Zero:");
		base = scan.nextFloat();
		while(base <= 0) {
			System.out.println("Numero invalido, digite um numero maior que Zero:");
			base = scan.nextFloat();
		}	
		System.out.println("Digite a Altura do Triangulo, que seja maior que Zero:");
		altura = scan.nextFloat();
		while(altura <= 0) {
			System.out.println("Numero invalido, digite um numero maior que Zero:");
			altura = scan.nextFloat();
		}
		
		area = (base * altura)/2f;
		System.out.printf("\n A Area do tringulo = %.2f", area);
		
		
		 System.out.println("Pressione Enter para sair...");
	     new Scanner(System.in).nextLine();  // Aguarda o usuário pressionar Enter
		 scan.close();
	}

}
