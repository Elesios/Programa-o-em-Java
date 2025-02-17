import java.util.Scanner;
import java.util.Random;

public class Pag148Exer08 {

	/*Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A — azul; P — preto; V — verde; e 
	C — castanho) e a cor dos cabelos (P — preto; C — castanho; L — louro; e R — ruivo) de seis pessoas, e que 
	calcule e mostre:
 	■ a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg; 
	■ a média das idades das pessoas com altura inferior a 1,50 m; 
	■ a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; e
 	■ a quantidade de pessoas ruivas e que não possuem olhos azuis. */
	
	public static void main(String[] args) {
		
		final int tam = 200;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int idade, cont_id_50 = 0, media_idade = 0, cont_p = 0;
		int olhos_azuis = 0, cont_nao_A_R = 0;
		float altura = 0, peso = 0;
		char[] olhos = {'A','P','V','C'}, cabelo = {'P','C','L','R'};;
		
		char OlhosAleatorio, cabeloAletorio;
		
		for(int i = 0; i < tam ; i++) {
		idade = rand.nextInt(80) + 1;
		altura = rand.nextFloat() * 1.50f + 0.50f;
		peso = rand.nextFloat() * 115 + 20;
		int indexOlhosAleatorio = rand.nextInt(olhos.length);
		OlhosAleatorio = olhos[indexOlhosAleatorio];
		int indexcabeloAletorio = rand.nextInt(cabelo.length);
		cabeloAletorio = cabelo[indexcabeloAletorio];
		
		System.out.printf("\n----------------");
		System.out.printf("\nIdade = %d",idade);
		System.out.printf("\nAltura = %.2f",altura);
		System.out.printf("\nPeso = %.2f",peso);
		
		switch (OlhosAleatorio) {
			case 'A':
				System.out.printf("\nOlhos = Azul");
				break;
			case 'P':
				System.out.printf("\nOlhos = Preto");
				break;
			case 'C':
				System.out.printf("\nOlhos = Castanho");
				break;
			case 'V':
				System.out.printf("\nOlhos = Verde");	
				break;
			default:
				break;
		}
		switch (cabeloAletorio) {
			case 'P':
				System.out.printf("\nCabelo = Preto");
				break;
			case 'C':
				System.out.printf("\nCabelo = Castanho");
				break;
			case 'L':
				System.out.printf("\nCabelo = Loiro");
				break;
			case 'R':
				System.out.printf("\nCabelo = Ruivo");	
				break;
			default:
				break;
			}
			if (idade > 50 && peso < 60) {
				cont_id_50 ++;
			}if(altura < 1.50f) {
				media_idade += idade;
				cont_p ++;
			}if(OlhosAleatorio == 'A') {
				 olhos_azuis ++; 
			}if(OlhosAleatorio != 'A' && cabeloAletorio == 'R') {
				 cont_nao_A_R ++;
			}
		
		}
		if(cont_p > 0) {
		media_idade = media_idade / cont_p;
		}else
			media_idade = 0 ;
		
		float porcen_azuis = (float)olhos_azuis / tam * 100;
		
		System.out.printf("\n---------------\n");
		System.out.printf("\nPessoas acima de 50 anos e peso menor que 60: %d \n", cont_id_50);
		System.out.printf("\nMedia de Idade de pessoas menor de 1.5 metros: %d \n",media_idade);
		System.out.printf("\nPorcentagem de pessoas com olhos Azuis: %.2f%% \n",porcen_azuis );
		System.out.printf("\nPessoas Ruivas que não possui olhos azuis: %d \n",cont_nao_A_R);
		
		scan.close();
	}

}
