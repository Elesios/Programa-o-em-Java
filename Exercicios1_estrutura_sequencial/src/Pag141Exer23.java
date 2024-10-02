/*ça um programa que receba o valor do salário mínimo, uma lista contendo
 *  a quantidade de quilowatts gasta por consumidor e o tipo de consumidor
 *   (1 — residencial; 2 — comercial; ou 3 — industrial) e que calcule e mostre:
 * 
 */

import java.util.Scanner;

public class Pag141Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tipo, quantidade_consumidor = 0;
		float salario_min, quilowatts, valor_quilowatts = 0, conta_final, conta_final_real = 0;
		float faturamento = 0;
		
			System.out.println("Digite o Salario Minimo:");
			salario_min = scan.nextFloat();
		do {			
			System.out.println("Digite o quilowatts gasto:");
			quilowatts = scan.nextFloat();
		
				if (quilowatts == 0) {
					System.out.println("Programa Encerrado:");
					break;
			}
		
			System.out.println("Digite:\n 1 — residencial; 2 — comercial; ou 3 — industrial:");
			tipo = scan.nextInt();
			//■ o valor de cada quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo;
			valor_quilowatts = salario_min / 8;
			
			/*■ o valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo encontra-se na tabela 
			a seguir:*/
			
			switch(tipo) {
				case 1:
						conta_final = (quilowatts * valor_quilowatts);
						conta_final_real = conta_final + (conta_final * 0.05f);
						break;
				case 2:		
						conta_final = (quilowatts * valor_quilowatts);
						conta_final_real = conta_final + (conta_final * 0.10f);
						break;
				case 3:		
					conta_final = (quilowatts * valor_quilowatts);
					conta_final_real = conta_final + (conta_final * 0.15f);
					break;	
				default:
					break;
			}
			//■ o faturamento geral da empresa;
			faturamento += conta_final_real;
			//■ a quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00. 
			if((conta_final_real >= 500.00) && (conta_final_real <= 1000.00)) {
				quantidade_consumidor++;
			}
					
		System.out.println("Valor Conta Final:" + conta_final_real);
		}while (quilowatts != 0);
		
		System.out.println("Valor Quilowatts:" + valor_quilowatts);
		System.out.println("O faturamento geral da empresa:" + faturamento);
		System.out.println("Contas entre 500 a 1000:" + quantidade_consumidor);
	}

}
