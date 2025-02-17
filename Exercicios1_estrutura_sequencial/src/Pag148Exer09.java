import java.util.Scanner;
import java.util.Random;

public class Pag148Exer09 {
		/*Faça um programa que receba dez idades, pesos e alturas, calcule e mostre: 
		■ a média das idades das dez pessoas; 
		■ a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e
 		■ a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de  
		1,90 m. */
	
	public static void main(String[] args) {
		
		final int tam = 100;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int idade, media_idade = 0, cont_90_alt = 0, cont_idade = 0;
		float Altura = 0, peso = 0, porcentagem = 0;

		for(int i = 0; i < tam; i++) {
			/*System.out.println("---Digite os Dados de 5 Pessoas" + i+1);
			System.out.println("Digite a Idade:");
			idade = scan.nextInt();
			System.out.println("Digite a Altura:");
			Altura = scan.nextFloat();
			System.out.println("Digite a peso:");
			peso = scan.nextFloat();*/
			
			idade = rand.nextInt(80)+8;
			Altura = rand.nextFloat() * 2.0f + 1.0f;
			peso = rand.nextFloat() *130 + 30;
			
			System.out.println("---------");
			System.out.println("Idade: " + idade);
            System.out.printf("Altura: %.2f metros\n", Altura);
            System.out.printf("Peso: %.2f kg\n", peso);
			
            media_idade += idade;
            
			if (peso > 90 && Altura < 1.5f) {
				cont_90_alt ++;
				
			}
			if(Altura > 1.9f) {
				if (idade >= 10 && idade <= 30) {
				cont_idade ++;
				}
			}
	}
		
		media_idade = media_idade / tam;
		
        
		porcentagem = (float) cont_idade / tam * 100;
		
		System.out.print("\n----------------------------:");
		System.out.print("\nResultados:");
		System.out.printf("\nMedia de Idade de todas as pessoas: %d", media_idade);
		System.out.printf("\nPeso Superior 90kg e Altura inferior 1.50 metros: %d", cont_90_alt);
		System.out.printf("\nQuantidade de pessoas entra 10 a 30 anos com 1,90 metros: %d", cont_idade);
		System.out.printf("\nPorcentagem de pessoas entra 10 a 30 anos com 1,90 metros: %.2f%%", porcentagem);
		
	scan.close();		
	}

}