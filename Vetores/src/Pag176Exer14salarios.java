import java.util.*;

public class Pag176Exer14salarios {

	public static void main(String[] args) {

		Random rand = new Random();

		float aumento = 0, Salario_novo = 0;
		float[] Salario = new float[5];
		int[] tempo = new int[5];
		String[] Funcionario = new String[5];
		// Vetor com 20 nomes
		String[] nome = { "Eder", "Igor", "Oliver", "Ana", "Bruno", "Carla", "Daniel", "Elisa", "Felipe", "Gabriela",
				"Hugo", "Isabela", "João", "Karina", "Lucas", "Mariana", "Nathan", "Olivia", "Pedro", "Raquel" };

		for (int i = 0; i < 5; i++) {

			int cont = 0;

			cont = rand.nextInt(20);
			Funcionario[i] = nome[cont];
			if (Funcionario.equals(nome)) {
				cont = rand.nextInt(20);
				Funcionario[i] = nome[cont];
			}
			Salario[i] = rand.nextFloat()* 800 + 500;
			tempo[i] = rand.nextInt(10);

		}
		System.out.println("----------------------");
		System.out.println("Não Receberam Aumento");
		for (int i = 0; i < 5; i++) {
			if (tempo[i] < 5 && Salario[i] > 800.00) {				
				System.out.println("Nome do funcionario:" + Funcionario[i]);
				System.out.printf("Salario:%.2f\n", Salario[i]);
				System.out.println("Tempo de Serviço:" + tempo[i]);
				System.out.println();
			}
		}
		System.out.println("----------------------");
		System.out.println("Receberao Aumento");
		for (int i = 0; i < 5; i++) {
			if (tempo[i] > 5 && Salario[i] < 800.00f) {
				aumento = Salario[i] * 0.35f;
				Salario_novo = Salario[i] + aumento;
				System.out.println("=======================");
				System.out.println("Nome do funcionario:" + Funcionario[i]);
				System.out.printf("Salario:%.2f\n", Salario[i]);
				System.out.println("Tempo de Serviço:" + tempo[i]);
				System.out.printf("Aumento de 35%%:%.2f\n", aumento);
				System.out.printf("Salario com aumento:%.2f\n", Salario_novo);
			} else if (tempo[i] > 5) {
				aumento = Salario[i] * 0.25f;
				Salario_novo = Salario[i] + aumento;
				System.out.println("=======================");
				System.out.println("Nome do funcionario:" + Funcionario[i]);
				System.out.printf("Salario:%.2f\n", Salario[i]);
				System.out.println("Tempo de Serviço:" + tempo[i]);
				System.out.printf("Aumento de 25%%:%.2f\n", aumento);
				System.out.printf("Salario com aumento:%.2f\n", Salario_novo);
			} else if (Salario[i] < 800.00) {
				aumento = Salario[i] * 0.15f;
				Salario_novo = Salario[i] + aumento;
				System.out.println("=======================");
				System.out.println("Nome do funcionario:" + Funcionario[i]);
				System.out.printf("Salario:%.2f\n", Salario[i]);
				System.out.println("Tempo de Serviço:" + tempo[i]);
				System.out.printf("Aumento de 15%%:%.2f\n", aumento);
				System.out.printf("Salario com aumento:%.2f\n", Salario_novo);
			}
		}
	}

}
