import java.util.Scanner;

public class Pag127Exer11{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		/*11. Faça um programa que receba um número inteiro maior que 1, verifique se o número 
		fornecido é primo ou não e mostre uma mensagem de número primo ou de número não primo.
		Um número é primo quando é divisível apenas por 1 e por ele mesmo. */
		
		int numero;
		boolean ehPrimo = true;
		
		System.out.println("Digite um número maior que 1:");
		numero = scan.nextInt();
		
		while (numero <= 1){
			System.out.println("Digite um número maior que 1:");
			numero = scan.nextInt();
		}
		for ( int i = 2 ; i <= (Math.sqrt(numero)) ; i++){
			if(numero % i == 0){
			ehPrimo = false;
			break;
			}
		}
		if(ehPrimo){
		System.out.println("Numero Primo:");
		}else			
		System.out.println("Numero Não Primo:");
		
	scan.close();	
	}
}