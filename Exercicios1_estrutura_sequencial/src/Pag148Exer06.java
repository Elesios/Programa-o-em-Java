import java.util.Scanner;
import java.util.Random;

public class Pag148Exer06 {
	public static void main(String[] args) {
		
		final int tam = 15;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String cod;
		float valor, a_vista = 0, a_prazo = 0, primeira_parcela = 0, total = 0;
		
		/*Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba 
		o código e o valor de quinze transações, calcule e mostre: 
		■ o valor total das compras à vista; 
		■ o valor total das compras a prazo; 
		■ o valor total das compras efetuadas; e
 		■ o valor da primeira prestação das compras a prazo juntas, sabendo-se que serão pagas em três vezes. 
		 	*/
		
		for (int i = 0; i < tam; i++) {
		System.out.printf("\n--- Transação %d de %d ---\n", i + 1, tam);	
		System.out.print("\nDigite V - Para A vista.");
		System.out.print("\nDigite P - Para Parcelado.");
		System.out.print("\nDigite o Tipo da Transação:");
		cod = scan.nextLine().trim().toUpperCase();
			while(!cod.equals("V") && !cod.equals("P")){
				System.out.print("Código inválido! Digite 'V' ou 'P':");
				cod = scan.nextLine().trim().toUpperCase();
			}
			System.out.println("\nDigite o Valor da Transação:");
			valor = rand.nextFloat(1000)+1;
			System.out.printf("\nValor:%.2f", valor);
			
			switch(cod) {
			case "V":
				System.out.println("\nopção escolhida Pagamento A vista:");
				a_vista += valor;
				break;
			case "P":
				System.out.print("\nopção escolhida Pagamento A prazo:");
				a_prazo += valor;	
				primeira_parcela += valor / 3f;
				break;
			default:
				break;
			}
		}
			total = a_vista + a_prazo;
			
			System.out.printf("\n--- Resultados ---\n");
			System.out.printf("\nO valor total das compras à vista: %.2f", a_vista);
			System.out.printf("\nO valor total das compras à prazo: %.2f", a_prazo);
			System.out.printf("\nO valor total das compras efetuadas: %.2f", total);
			System.out.printf("\nO valor da primeira parcela das compras: %.2f", primeira_parcela);	
		
			scan.close();
		
		
		
		}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

