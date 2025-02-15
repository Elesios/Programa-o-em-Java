import java.util.Scanner;
import java.util.Random;

public class Pag148Exer07 {
	/*Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule e mostre: 
	■ a quantidade de pessoas com idade superior a 50 anos; 
	■ a média das alturas das pessoas com idade entre 10 e 20 anos; 
	■ a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas*/
	
	public static void main(String[] args) {
		
		final int tam = 10;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int idade, acima_50 = 0, cont_10_a_20 = 0, cont_peso = 0;
		float Altura = 0, peso = 0, altura_media_10_A_20 = 0, peso_40 = 0;

		for(int i = 0; i < tam; i++) {
			/*System.out.println("---Digite os Dados de 5 Pessoas" + i+1);
			System.out.println("Digite a Idade:");
			idade = scan.nextInt();
			System.out.println("Digite a Altura:");
			Altura = scan.nextFloat();
			System.out.println("Digite a peso:");
			peso = scan.nextFloat();*/
			
			idade = rand.nextInt(80)+8;
			Altura = rand.nextFloat() * 1.5f + 0.50f;
			peso = rand.nextFloat() *130 + 30;
			
			System.out.println("---------");
			System.out.println("Idade: " + idade);
            System.out.printf("Altura: %.2f metros\n", Altura);
            System.out.printf("Peso: %.2f kg\n", peso);
			
			if (idade > 50) {
				acima_50 ++;
			}
			if (idade >= 10 && idade <= 20) {
				cont_10_a_20 ++;
				altura_media_10_A_20 += Altura;
			}
			if (peso < 40) {
				cont_peso ++;
			}	
	}
		 // Cálculo da média de altura para pessoas entre 10 e 20 anos
        if (cont_10_a_20 > 0) {
            altura_media_10_A_20 /= cont_10_a_20;
        } else {
            altura_media_10_A_20 = 0; // Evita divisão por zero
        }
		peso_40 = (float) cont_peso / tam * 100;
		
		System.out.print("\nPessoas com idade superior a 50 Anos:" + acima_50);
		System.out.printf("\nA media da altura entre pessoas 10 a 20: %.2f", altura_media_10_A_20);
		System.out.printf("\nQuantidade de pessoas com peso inferior a 40 kilos: %.2f", peso_40);
					
	scan.close();		
	}

}
