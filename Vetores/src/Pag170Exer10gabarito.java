import java.util.Arrays;
import java.util.Random;

public class Pag170Exer10gabarito {

	public static void main(String[] args) {

		Random rand = new Random();

		char[] gabarito = new char[10];
		int alunos = 10, nota = 0;
		char[] resposta = new char[10];
		//char[] opcoes = { 'A', 'B'};
		char[] opcoes = { 'A', 'B', 'C', 'D' };
		String[] nome = { "Eder", "Igor", "Oliver", "Ana", "Bruno", "Carla", "Daniel", "Elisa", "Felipe", "Gabriela",
				"Hugo", "Isabela", "João", "Karina", "Lucas", "Mariana", "Nathan", "Olivia", "Pedro", "Raquel" };

		for (int i = 0; i < 10; i++) {
			gabarito[i] = opcoes[rand.nextInt(opcoes.length)];
		}
		System.out.print("\n-----------------------------");
		System.out.print("\nGabarito:" + Arrays.toString(gabarito));
		System.out.print("\n-----------------------------");
		for (int i = 0; i < alunos; i++) {
			nota = 0;			
			
			for (int j = 0; j < 10; j++) {	
				resposta[j] = opcoes[rand.nextInt(opcoes.length)];
				if (resposta[j] == gabarito[j]) {
					nota++;
				}
			}
			System.out.print("\n=========================================");
				System.out.print("\nAluno:");
				System.out.print(nome[rand.nextInt(nome.length)] + ": ");
				System.out.print(Arrays.toString(resposta));
				System.out.print("\nNumero Aluno:" + (i+1));
				System.out.print("\nNota do Aluno:" + nota);
				System.out.print("\n=====================================");
			
		}
	}
}
