import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Pag126Exe10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int cont = 1, controle, idade, media_idade = 0, quantidade = 0;
		float peso, altura, media_altura = 0, porcentagem_peso = 0;

		// . Em um campeonato de futebol existem cinco times e cada um possui onze
		// jogadores. Faça um programa que receba a idade, o peso e a altura de cada um
		// dos jogadores, calcule e mostre:
		
		for (int j = 0; j < 5; j++) {
			media_idade = 0;
			
			for (int i = 0; i < 11; i++) {
				
				idade = random.nextInt(22) +15; // Idades entre 15 e 36 anos
				peso = random.nextFloat() * (100 - 60) +60; // Peso entre 60kg e 100kg
				altura = random.nextFloat() * (2.00f - 1.50f) + 1.50f; // Altura entre 1.50m e 2.00m
				
				//System.out.println("Jogador " + cont + ": Idade = " + idade + ", Peso = " + peso + "kg, Altura = " + altura + "m");
				System.out.printf("Jogador %d: Idade = %d, Peso = %.2fkg, Altura = %.2fm%n", cont, idade, peso, altura);
				/*
				System.out.println("Digite a Idade do Jogador numero: " + cont);
				idade = scan.nextInt();
				System.out.println("Digite o Peso do jogador numero: " + cont);
				peso = scan.nextFloat();
				System.out.println("Digite a Altura do jogador numero: " + cont);
				altura = scan.nextFloat();
				*/

				if (idade <= 18) { // a quantidade de jogadores com idade inferior a 18 anos;
					quantidade = +1;
				}
				media_idade += idade; // a média das idades dos jogadores de cada time;
				media_altura += altura; // a média das alturas de todos os jogadores do campeonato
				if (peso > 80) {
					porcentagem_peso += 1; // a porcentagem de jogadores com mais de 80 kg entre todos os jogadores do campeonato.
				}
				cont += 1;
			}
			int calc_idade = media_idade / 11;
			System.out.println("A Media idade deste time é: " + calc_idade);
			System.out.println("---------------------------------------------------------------------------: ");
			System.out.println("---------------------------------------------------------------------------: ");
			System.out.println("---------------------------------------------------------------------------: ");
			System.out.println("---------------------------------------------------------------------------: ");
		}
		
		float calc_altura = media_altura / 55;
		float porc = (porcentagem_peso * 100) /55;

		System.out.println("A Quantidade de Jogadores abaixo dos 18 anos: " + quantidade);
		System.out.println("A Media da altura deste time é: " + calc_altura);
		System.out.println("A Media de jogadores acima de 80kgs: " + porc);
		

		scan.close();
	}

}
