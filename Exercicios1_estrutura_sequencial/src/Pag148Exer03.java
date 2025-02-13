import java.util.Scanner;
import java.util.Random;

public class Pag148Exer03 {

	public static void main(String[] args) {
		
		final int tam = 50;
		int idade = 0, cont_15 = 0, cont_16_a_30 = 0, cont_31_a_45 = 0,cont_46_a_60 = 0,cont_60 = 0;
		float pessoas_faixa1, pessoas_faixa2;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		for(int i = 0 ; i < tam ;  i++) {
			//System.out.println("Digite a Idade;");
			//idade = scan.nextInt();
			idade = rand.nextInt(80) + 1;
				 if ( idade <= 15){
					 cont_15++;
				 	}
				 if ( idade >= 16 && idade <= 30){
					 cont_16_a_30++;
				 	}
				 if ( idade >= 31 && idade <= 45){
					 cont_31_a_45++;
				 	}
				 if ( idade >= 46 && idade <= 60){
					 cont_46_a_60++;
				 	}
				 if ( idade > 60){
					 cont_60++;
				 	}
		}
		System.out.printf("\n Pessoas na Faixa Etaria Menores que 15 anos; %d", cont_15);
		System.out.printf("\n Pessoas na Faixa Etaria entre 16 e 30 anos; %d", cont_16_a_30);
		System.out.printf("\n Pessoas na Faixa Etaria entre 31 e 45 anos; %d", cont_31_a_45);
		System.out.printf("\n Pessoas na Faixa Etaria entre 46 e 60 anos; %d", cont_46_a_60);
		System.out.printf("\n Pessoas na Faixa Etaria Maiores que 60 anos; %d", cont_60);
		pessoas_faixa1 = (float) ((float) cont_15 / tam * 100.0);
		pessoas_faixa2 = (float) ((float) cont_60 / tam * 100.0);
		
		System.out.printf("\nPorcentagem de Pessoas na Faixa Etaria Menores que 15 anos; %.2f%%", pessoas_faixa1 );
		System.out.printf("\nPorcentagem de Pessoas na Faixa Etaria  Maiores que 60 anos; %.2f%%", pessoas_faixa2);
	}	
}
