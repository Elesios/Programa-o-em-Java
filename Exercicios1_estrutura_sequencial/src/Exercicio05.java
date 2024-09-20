
import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double peca, N_peca, V_peca, Soma1, Soma2, Produto;

		System.out.println("Digite o Numero da Peça:");
		peca = scan.nextDouble();
		N_peca = scan.nextDouble();
		V_peca = scan.nextDouble();

		Soma1 = N_peca * V_peca;

		System.out.println("Digite o Numero da Peça:");
		peca = scan.nextDouble();
		N_peca = scan.nextDouble();
		V_peca = scan.nextDouble();

		Soma2 = N_peca * V_peca;
		Produto = Soma1 + Soma2;
		System.out.printf("\nValor a ser Pago = %.2f", Produto);
		
		scan.close();
	}

}
