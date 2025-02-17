import java.util.Random;


	/**
	 *  Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos 
		pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 
		30 anos e de 31 anos para cima.
 	*/
public class Pag148Exer13 {

	public static void main(String[] args) {
		
		final int tam = 15;
		int idade, cont_1_a_10 = 0, cont_11_a_20 = 0, cont_21_a_30 = 0, cont_31_mais = 0;
		float peso, media_peso_1_a_10 = 0, media_peso_11_a_20 = 0, media_peso_21_a_30 = 0, media_peso_30_mais = 0;
		
		Random rand = new Random();
		
		for(int i = 0; i < tam ; i++) {
			System.out.print("\n-----------------:");
			System.out.print("\nDigite a Idade:");
			idade = rand.nextInt(50) + 1;
			System.out.printf("\nIdade:%d", idade);
			//System.out.print("\nDigite o Peso:");
			//peso = rand.nextFloat(100) +1;
			//System.out.printf("\nPeso: %.2f", peso);
			
			if (idade >= 1 && idade < 11) {
				System.out.print("\nDigite o Peso:");
				peso = rand.nextFloat(20) +1;
				System.out.printf("\nPeso: %.2f", peso);
				media_peso_1_a_10 += peso;
				 cont_1_a_10++;
			}
			if (idade >= 11 && idade < 21) {
				System.out.print("\nDigite o Peso:");
				peso = rand.nextFloat(60) +30;
				System.out.printf("\nPeso: %.2f", peso);
				media_peso_11_a_20 += peso;
				cont_11_a_20++;
			}
			if (idade >= 21 && idade < 30) {
				System.out.print("\nDigite o Peso:");
				peso = rand.nextFloat(130) +40;
				System.out.printf("\nPeso: %.2f", peso);
				media_peso_21_a_30 += peso;
				cont_21_a_30++;
			}
			if (idade >30) {
				System.out.print("\nDigite o Peso:");
				peso = rand.nextFloat(130) +40;
				System.out.printf("\nPeso: %.2f", peso);
				media_peso_30_mais += peso;
				cont_31_mais++;
			}
		}
			media_peso_1_a_10 = media_peso_1_a_10 /  cont_1_a_10;
			media_peso_11_a_20 = media_peso_11_a_20 / cont_11_a_20;
			media_peso_21_a_30 = media_peso_21_a_30 / cont_21_a_30;
			media_peso_30_mais = media_peso_30_mais / cont_31_mais;
			
			System.out.print("\n-----------------:");
			System.out.printf("\nAmedia do peso entre idades de 1 a 10 : %.2f", media_peso_1_a_10);
			System.out.printf("\nAmedia do peso entre idades de 11 a 20 : %.2f", media_peso_11_a_20);
			System.out.printf("\nAmedia do peso entre idades de 21 a 30 : %.2f", media_peso_21_a_30);
			System.out.printf("\nAmedia do peso entre idades acima de 30 : %.2f", media_peso_30_mais);
	}

}
