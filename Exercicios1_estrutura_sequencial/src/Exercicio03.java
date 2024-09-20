import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int a, b , c, d, produto;
		
		System.out.println("Digite os Produtos de A - B - C - D;");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		produto = (a * b) - (c * d);
		System.out.println("Diferenca dos Produtos = " + produto);
		scan.close();
	}

}
