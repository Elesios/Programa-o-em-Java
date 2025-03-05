import java.util.*;
/*
 *  11. Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor. 
	Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (mostrar o mês por 
	extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.
 */

public class Pag173Exer11temperatura {
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] temp = new int[12];
		int maior = 0 , menor = 0, maior_mes = 0, menor_mes = 0;
		
		//Preenchendo vetores randomicamente. com valores 0 a 40
		for(int i = 0 ; i < 12; i++) {
		temp[i] = rand.nextInt(40);
		
			if (i == 0) {
				// iniciazando variaveis com primeira posição do vetor
				maior = temp[0];
				menor = temp[0];
				maior_mes = i;
				menor_mes = i;
			}else if(temp[i] > maior) {
				maior = temp[i];
				maior_mes = i;
			}
			if(temp[i] < menor) {
				menor = temp[i];
				menor_mes = i;
			}
		}
		// iniciazando variaveis com primeira posição do vetor
				
		
		System.out.println("Maior temperatura:"+maior+"C");
		if (maior_mes == 0) {
			System.out.println("Janeiro:");
		}
		if (maior_mes == 1) {
			System.out.println("Fevereiro:");	
		}
		if (maior_mes == 2) {
			System.out.println("Março:");	
		}
		if (maior_mes == 3) {
			System.out.println("Abriu:");	
	    }
		if (maior_mes == 4) {
			System.out.println("Maio:");
		}
		if (maior_mes == 5) {
			System.out.println("Junho:");	
		}
		if (maior_mes == 6) {
			System.out.println("Julho:");	
		}
		if (maior_mes == 7) {
			System.out.println("Agosto:");	
	    }
		if (maior_mes == 8) {
			System.out.println("Setembro:");
		}
		if (maior_mes == 9) {
			System.out.println("Outubro:");	
		}
		if (maior_mes == 10) {
			System.out.println("Novembro:");	
		}
		if (maior_mes == 11) {
			System.out.println("Dezembro:");	
	    }
		System.out.println("----------------------");
		System.out.println("Menor Temperatura:"+menor +"C");
		
		if (menor_mes == 0) {
			System.out.println("Janeiro:");
		}
		if (menor_mes == 1) {
			System.out.println("Fevereiro:");	
		}
		if (menor_mes == 2) {
			System.out.println("Março:");	
		}
		if (menor_mes == 3) {
			System.out.println("Abriu:");	
	    }
		if (menor_mes == 4) {
			System.out.println("Maio:");
		}
		if (menor_mes == 5) {
			System.out.println("Junho:");	
		}
		if (menor_mes == 6) {
			System.out.println("Julho:");	
		}
		if (menor_mes == 7) {
			System.out.println("Agosto:");	
	    }
		if (menor_mes == 8) {
			System.out.println("Setembro:");
		}
		if (menor_mes == 9) {
			System.out.println("Outubro:");	
		}
		if (menor_mes == 10) {
			System.out.println("Novembro:");	
		}
		if (menor_mes == 11) {
			System.out.println("Dezembro:");	
	    }
				
		
	}
		
}
