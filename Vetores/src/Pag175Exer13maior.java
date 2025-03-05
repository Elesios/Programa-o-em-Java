import java.util.*;

/*
 * Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números su
	periores a cinquenta e suas respectivas posições. O programa deverá mostrar mensagem se não existir 
	nenhum número nessa condição.
 */
public class Pag175Exer13maior {

	public static void main(String[] args) {
		Random rand = new Random();

		int cont = 0;
		int[] num = new int[10];
		

		// Preenchendo o vetor com 10 números aleatórios (0 a 69)
		for (int i = 0; i < 10; i++) {
			num[i] = rand.nextInt(70);

			if (num[i] > 50) {
				System.out.println("Numero:" + num[i] + " - na posição:" + i);
				cont++;
			}

		}
		// Verificando se existem números acima de 50
		if (cont == 0) {
			System.out.println("Não Existe Numeros acima de 50.");
		}
	}

}
