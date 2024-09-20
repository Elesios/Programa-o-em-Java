import java.util.Scanner;
import java.util.Random;

public class Pag127Exer12 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int Numero_Op, peca_fabri, salario = 1000, media_peca_M = 0, cont_M = 0; 
		int media_peca_F = 0, cont_F = 0, maior_salario = 0, Operario = 0;
		String[] generos = {"M","F"};

		
		for ( int i = 1 ; i <= 15; i++){
           		salario = 1500;
			Numero_Op = i;
			peca_fabri = rand.nextInt (61) +20;
			int indexAleatorio = rand.nextInt(generos.length);
			String generoAleatorio = generos[indexAleatorio];
			
			if (peca_fabri <= 30){	
				System.out.println("Sexo: " + generoAleatorio);
				System.out.println("Numero do Operario: " + i + " e seu Salario: " + salario); //o número do operário e seu salário;			
				System.out.println("Peças fabricadas deste Operario:" + peca_fabri);
			}else if (peca_fabri > 30 && peca_fabri <= 50){	
				System.out.println("Sexo: " + generoAleatorio);
				salario += (salario * 0.03f) * (peca_fabri - 30);		
				System.out.println("Numero do Operario: " + i + " e seu Salario: " + salario); //o número do operário e seu salário;			
				System.out.println("Peças fabricadas deste Operario:" + peca_fabri);
			}else if (peca_fabri > 50){	
				System.out.println("Sexo: " + generoAleatorio);
				salario += (salario * 0.05f) * (peca_fabri - 30);	
				System.out.println("Numero do Operario: " + i + " e seu Salario: " + salario); //o número do operário e seu salário;			
				System.out.println("Peças fabricadas deste Operario:" + peca_fabri);
			}

			if ( salario > maior_salario){
			maior_salario = salario;
			Operario = i;
			}
			if (generoAleatorio.equals("M")) {
				cont_M +=1;
				media_peca_M += peca_fabri; 
			}else 
				cont_F +=1;
				media_peca_F += peca_fabri; 			
			
		}
		
		media_peca_M = media_peca_M / cont_M;
		media_peca_F = media_peca_F / cont_F;
		
		System.out.println("a média de peças fabricadas pelos homens:"  + media_peca_M); //a média de peças fabricadas pelos homens;
		System.out.println("a média de peças fabricadas pelas Mulheres:"  + media_peca_F); //a média de peças fabricadas pelas Mulheres;
		System.out.println("Funcioario de maior destaque foi numero:"  + Operario + "e Salario de:" + maior_salario); //a média de peças fabricadas pelos homens;	
	}
}