import java.util.Random;


	/**
	 * Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua opinião 
		em relação ao filme: ótimo — 3; bom — 2; regular — 1. Faça um programa que receba a idade e a 
		opinião de quinze espectadores, calcule e mostre: 
		■ a média das idades das pessoas que responderam ótimo; 
		■ a quantidade de pessoas que responderam regular; e
 		■ a percentagem de pessoas que responderam bom, entre todos os espectadores analisados. .
 	*/
public class Pag148Exer14 {

	public static void main(String[] args) {
		
		final int tam = 15;
		int idade, nota = 0, media_idade = 0, quant_bom = 0, quant_regular = 0, cont_otimo = 0;
		
		
		Random rand = new Random();
		
		for(int i = 0; i < tam ; i++) {
			System.out.print("\n-----------------:");
			System.out.print("\nDigite a Idade:");
			idade = rand.nextInt(65) + 15;
			System.out.printf("\nIdade:%d", idade);
			System.out.print("\nDigite a Nota do filme:"
					+ "\n1 - Para Otimo \n 2 - Para Bom\n 3 - Para Regular");
			 nota = rand.nextInt(3) +1;
			System.out.printf("\nNota: %d", nota);
			
			switch (nota) {
			
				case 1:
					media_idade += idade;
					cont_otimo++;
					break;
				case 2:
					quant_bom++;
					break;
				case 3:
					quant_regular++;
					break;
			
			}
		}
			
		media_idade = media_idade / cont_otimo;
		float porcen_bom = (float)quant_bom / tam * 100;
			
				
			System.out.print("\n-----------------:");
			System.out.print("\nResultados:");
			System.out.printf("\nA média das idades das pessoas que responderam ótimo: %d", media_idade);
			System.out.printf("\nA quantidade de pessoas que responderam regular: %d", quant_regular);
			System.out.printf("\nPorcentagem dos que responderam bom : %.2f%%", porcen_bom);
			
	}

}