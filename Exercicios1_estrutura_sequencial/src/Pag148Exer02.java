import java.util.Scanner;
import java.util.Random;

public class Pag148Exer02 {

	public static void main(String[] args) {
		/*
		 * Uma companhia de teatro deseja montar uma série de espetáculos. A direção calcula que, a  
		R$ 5,00 o ingresso, serão vendidos 120 ingressos, e que as despesas serão de R$ 200,00. Diminuindo-se em 
		R$ 0,50 o preço dos ingressos, espera-se que as vendas aumentem em 26 ingressos. Faça um programa que 
		escreva uma tabela de valores de lucros esperados em função do preço do ingresso, fazendo-se variar esse preço de 
		R$ 5,00 a R$ 1,00, de R$ 0,50 em R$ 0,50. Escreva, ainda, para cada novo preço de ingresso, o lucro 
		máximo esperado, o preço do ingresso e a quantidade de ingressos vendidos para a obtenção desse lucro.
		 */
		Scanner scan = new Scanner(System.in); //linha de codico para entrda de dados
		Random rand = new Random(); // Linha de codigo para random
		
		float preco_do_incresso = 5, lucro_esperado = 0, despesa = 200;
		int quant = 120;
		
						
		for(int i = 0; i < 9; i++) {
						
			lucro_esperado = (preco_do_incresso * quant) - despesa;
			System.out.printf("\nQuantidade de Ingresso Disponivel: %d", quant);
			System.out.printf("\nOs preços dos Ingressos São: %.2f", preco_do_incresso);
			System.out.printf("\nLucro MAximo esperado nesse valor: %.2f", lucro_esperado);
			
			preco_do_incresso = (float) (preco_do_incresso - 0.50);
			quant += 26;
			System.out.println("\n----------------------------------------------------------------------------------\n");
		}
		
	}

}
