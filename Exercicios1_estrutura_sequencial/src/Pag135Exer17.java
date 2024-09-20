
/*Faça um programa que receba o salário de um funcionário chamado Carlos. 
Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. Carlos aplicará seu salário 
integralmente na caderneta de poupança, que rende 2% ao mês, e João aplicará seu salário integralmente no 
fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a 
quantidade de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor 
pertencente a Carlos.
*/
public class Pag135Exer17 {

	public static void main(String[] args) {

		float carlos = 1000, joao = 0, poupan_carlos = 0, renda_fixa_joao = 0, carlos_total = 0, joao_total = 0;
		int meses = 1;
		joao = (carlos / 3f);
		
			
		while (joao <= carlos) {
			
			carlos = carlos + (carlos * 2 /100);
			joao = joao + (joao * 5 /100);
			meses += 1;
			
			System.out.printf("\n------------------------------------------------");
			System.out.printf("\nRendimento total do Carlos Mes:%.2f", carlos);
			System.out.printf("\nRendimento total do Joao:%.2f", joao);
			System.out.printf("\nMeses: %d = ", meses);
			
			
			
		}
		
		

	}

}