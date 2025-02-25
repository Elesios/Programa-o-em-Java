import java.util.Random;
import java.util.Arrays;

public class Pag160Exer03 {

	public static void main(String[] args) {

		final int tam = 10;
		Random rand = new Random();

		int[] vetor1 = new int[tam];
		int[] vetor2 = new int[tam];
		int[] intercalado = new int[tam * 2];

		// preenchendo Vetor 1 e impressando de sua posiçao
		System.out.printf("Vetor 1:");
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = rand.nextInt(50) + 10;
			System.out.printf("|%d| - ", vetor1[i]);
		}
		System.out.println();
		System.out.printf("Posiçao:");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.printf("|0%d| - ", i);
		}
		System.out.println("\n----------------------------------------------------------------------------");

		// preenchendo Vetor 2 e impressando de sua posiçao
		System.out.printf("Vetor 2:");
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = rand.nextInt(70) + 10;
			System.out.printf("|%d| - ", vetor2[i]);
		}
		System.out.println();
		System.out.printf("Posiçao:");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.printf("|0%d| - ", i);
		}

		// preenchendo Vetores 1 e 2. e impressando de sua posiçao
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.printf("Vetores 1 e 2:");

		for (int i = 0; i < tam; i++) {
			System.out.printf("|%d| - |%d| - ", vetor1[i], vetor2[i]);
		}
		System.out.println();
		System.out.printf("Posiçao:      ");
		for (int i = 0; i < 9; i++) {
			System.out.printf("|%d | - ", i + 1);
		}
		for (int i = 9; i < 20; i++) {
			System.out.printf("|%d| - ", i + 1);
		}
		System.out.println("\n----------------------------------------------------------------------------");
		// ordernando em ordem crescente
		Arrays.sort(vetor1);
		Arrays.sort(vetor2);

		int j = 0;
		for (int i = 0; i < tam; i++) {
			intercalado[j++] = vetor1[i];
			intercalado[j++] = vetor2[i];
		}
		// imprissao vetores 1 e 2 em ordem crescente
		Arrays.sort(intercalado);
		System.out.printf("Intercalados em Ordem Crescente:");
		for (int num : intercalado) {
			System.out.printf("|%d| - ", num);
		}
		System.out.println();
		System.out.printf("Posiçao:                        ");
		for (int i = 0; i < 9; i++) {
			System.out.printf("|%d | - ", i + 1);
		}
		for (int i = 9; i < 20; i++) {
			System.out.printf("|%d| - ", i + 1);
		}

	}
}
