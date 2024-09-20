import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x, y, soma;

		System.out.println("Digite o Primeiro Numero:");
		x = scan.nextInt();
		System.out.println("Digite o Segundo Numero:");
		y = scan.nextInt();

		soma = x + y;

		System.out.println("Numero digitado:" + soma);
		scan.close();
	}

}
