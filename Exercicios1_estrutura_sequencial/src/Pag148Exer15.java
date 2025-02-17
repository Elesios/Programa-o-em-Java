import java.util.Random;

/*
 *  Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto
 *   lançado. Para isso, forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se 
	que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre: 
	■ o número de pessoas que responderam sim; 
	■ o número de pessoas que responderam não; 
	■ o número de mulheres que responderam sim; e
 	■ a percentagem de homens que responderam não, entre todos os homens analisados.
 */
public class Pag148Exer15 {

	public static void main(String[] args) {
		final int tam = 10;
		Random rand = new Random();
		char[] sexo = { 'F', 'M' };
		char sexo_aleatorio;
		String[] resposta = { "SIM", "NAO" };
		String resposta_aleatorio;
		int cont_sim = 0, cont_N = 0, cont_F = 0, cont_M = 0, cont_nao_M = 0;
		float porcen_homem = 0;

		for (int i = 0; i < tam; i++) {
			System.out.print("\n--------------------------------------");
			System.out.print("\nGostarm do produto lançado pela nossa empresa?");
			int indexsexo_aleatorio = rand.nextInt(sexo.length);
			sexo_aleatorio = sexo[indexsexo_aleatorio];
			int indexresposta_aleatorio = rand.nextInt(resposta.length);
			resposta_aleatorio = resposta[indexresposta_aleatorio];

			System.out.printf("\nResposta:%s", resposta_aleatorio);
			System.out.printf("\nSexo:%c", sexo_aleatorio);

			if (sexo_aleatorio == 'M') {
				cont_M++;
				if (resposta_aleatorio == "NAO") {
					cont_nao_M++;
				}
			}

			if (resposta_aleatorio == "SIM") {
				cont_sim++;
				if (sexo_aleatorio == 'F') {
					cont_F++;
				}
			} else {
				cont_N++;
			}
		}
		
		porcen_homem = (float)cont_nao_M / cont_M * 100;
		
		 System.out.print("\n--------------");
		 System.out.print("\nResposta");	
		 System.out.printf("\nPessoas que responderam sim:%d", cont_sim);
		 System.out.printf("\nPessoas que responderam Nao:%d", cont_N);
		 System.out.printf("\nMulheres que responderam sim:%d", cont_F);
		 System.out.printf("\nPorcentagem dos homens que responderam nao:%.2f%%", porcen_homem);
		 
	}

}
