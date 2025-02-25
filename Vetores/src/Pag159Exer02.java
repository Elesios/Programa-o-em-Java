import java.util.Random;


/*
 *  
 Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O 
vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas. 
O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de 
cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços 
e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). 
Depois, determine e mostre:
 ■ um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final, 
deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e
 ■ o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).
 */
public class Pag159Exer02 {

	public static void main(String[] args) {
		
		final int tam = 10;
		Random rand = new Random();
		
		int indiceMaisVendido  = 0;
		float salario = 545.00f, venda_total = 0, geral_venda = 0;
		
		// declaraçao dos vetores
		int[] quantidade_vendida = new int[10];
		float[] preco = new float[10];
		
		
		System.out.println("=========== Cadastro de Vendas ===========");
		
		for (int i = 0; i < preco.length; i++) {
			
			System.out.print("\n----------------------:");
			System.out.print("\nDigite o Preço do Produto:");
			preco[i] = rand.nextFloat()*99.9f  + 1.99f; // gera numeros de 1,99 a 99,99
			System.out.printf(" %.2f", preco[i]);
			
			System.out.print("\nDigite a Quantidade da compra:");
			quantidade_vendida[i] = rand.nextInt(30)+ 1; // gera numeros de 1 a 30
			System.out.printf(" %d", quantidade_vendida[i]);
			
			venda_total =  preco[i] * quantidade_vendida[i];
			System.out.printf("\nValor Total da Venda: %.2f\n", venda_total);
			
			
			geral_venda += venda_total;
		}
		 for (int i = 1; i < quantidade_vendida.length; i++) {
	            if (quantidade_vendida[i] > quantidade_vendida[indiceMaisVendido]) {
	                indiceMaisVendido = i; // Atualiza o índice do maior valor encontrado
	            }
	        }
	              
	    float comissao = geral_venda * 0.05f;
		float salario_novo = salario + comissao;
		
		
		 System.out.println("\n=========== Relatório de Vendas ===========");
		System.out.printf("\nVenda Geral: %.2f", geral_venda) ;		
		System.out.printf("\nValor do objeto mais vendido: %.2f", preco[indiceMaisVendido]);
	    System.out.printf("\nNa posição: %d", indiceMaisVendido);
		System.out.printf("\nComissão: %.2f", comissao) ;
		System.out.printf("\nSalario Liquido: %.2f", salario_novo) ;
		
		
		
		
		
	}

}
