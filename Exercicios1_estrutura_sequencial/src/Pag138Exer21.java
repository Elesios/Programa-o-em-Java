/*21. Faça um programa que receba vários números, calcule e mostre: 
 ■ a soma dos números digitados; 
 ■ a quantidade de números digitados; 
 ■ a média dos números digitados; 
 ■ o maior número digitado; 
 ■ o menor número digitado; 
 ■ a média dos números pares; 
 ■ a porcentagem dos números ímpares entre todos os números digitados. 
Finalize a entrada de dados com a digitação do número 30.000.*/

import java.util.Scanner;
import java.util.Random;

public class Pag138Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //linha de codico para entrda de dados
		Random rand = new Random(); // Linha de codigo para random
		
		int num, soma = 0, quantidade = 0, maior = 0, menor = 0,  quant_par = 0, quanti_impar = 0;
		int soma_pare = 0;
		float media_pare = 0, porce_impares = 0, media = 0;
		
		
		do {
			System.out.println("Digite qualquer numero:");
			num = scan.nextInt();
			
			if (num == 30000) {
				System.out.println("Programa Finalizado:"); // verifica a finalizaçao do programa de acordo com o enunciado
				break;
			}
			
			if (quantidade == 0) {
				maior = num;
				menor = num;
			}
			
			soma += num;
			quantidade +=1;
			
				if (num > maior) {
				maior = num;
				}
				if (num < menor) {
				menor = num;
				}
				if (num % 2 == 0) {
					soma_pare += num;
					quant_par += 1;
					}else {
						quanti_impar +=1;
					}
					
						
					
			
		}while(num!=30000);
			
			if(quantidade > 0) {
				media = soma/quantidade;
			}
			if(quant_par > 0) {
				media_pare = soma_pare / quant_par;
			}
			if (quantidade >0) {
				porce_impares = (quanti_impar * 100) / quantidade;
			}
			
			// Exibição dos resultados
	        System.out.println("A Soma dos Números Digitados: " + soma);
	        System.out.println("A Quantidade de Números Digitados: " + quantidade);
	        System.out.println("A Média dos Números Digitados: " + media);
	        System.out.println("O Maior Número Digitado: " + maior);
	        System.out.println("O Menor Número Digitado: " + menor);
	        System.out.println("A Média dos Números Pares: " + media_pare);
	        System.out.println("A Porcentagem dos Números Ímpares: " + porce_impares + "%");

	        scan.close(); // Fechar o Scanner para liberar recursos
	}

}
