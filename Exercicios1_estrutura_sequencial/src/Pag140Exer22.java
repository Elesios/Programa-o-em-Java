/*22. Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para
preenchimento de vagas em seu quadro de funcionários. Supondo que você seja o programador dessa 
empresa, faça um programa que leia, para cada candidato, a idade, o sexo (M ou F) e a experiência no 
serviço (S ou N). Para encerrar a entrada de dados, digite zero para a idade.
O programa também deve calcular e mostrar:
 ■ o número de candidatos do sexo feminino; 
 ■ o número de candidatos do sexo masculino; 
 ■ a idade média dos homens que já têm experiência no serviço; 
 ■ a porcentagem dos homens com mais de 45 anos entre o total dos homens; 
 ■ o número de mulheres com idade inferior a 21 anos e com experiência no serviço; 
 ■ a menor idade entre as mulheres que já têm experiência no serviço.*/

import java.util.Scanner;

public class Pag140Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade = 0, cont_M = 0, cont_F = 0, media_H = 0, mulheres = 0, mulheres_menor = Integer.MAX_VALUE, menor = 0;
		int total_homens_experientes = 0, homens_mais_45 = 0;
		float porcentagem_H = 0;
		String sexo = null, experiencia;
		
		do {
		
		
		//entrada de dados idade
		System.out.println("Digite a Idade do Candidato:");
		idade = scan.nextInt();
		
		//validação se o programa vai ser encerrado
		if (idade == 0) {
			System.out.println("Programa Encerrado:");
			break;
		}
		if ((idade < 18) || (idade > 65)) {
            System.out.println("Idade Invalida:");
            continue; // Volta para o início do laço e solicita novamente
		}
		
		
		//limpeza de buffer 			
		scan.nextLine();
		//entrada de dados sexo
		System.out.println("Digite o Sexo: (M) para Masculino (F) para Feminino");
		sexo = scan.nextLine().toUpperCase();
		if (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.");
            continue; // Volta para o início do laço e solicita novamente
        }
		System.out.println("Digite a Experiencia: (S) Sim (N) Nâo");
		experiencia = scan.nextLine().toUpperCase();
		if (!experiencia.equals("S") && !experiencia.equals("N")) {
            System.out.println("Experiencia inválido! Digite 'S' para sim ou 'N' para Nâo.");
            continue; // Volta para o início do laço e solicita novamente
        }
		//■ o número de candidatos do sexo feminino; 
		if (sexo.equals("F")) {
					cont_F += 1;
			//■ o número de mulheres com idade inferior a 21 anos e com experiência no serviço; 
			if ((idade < 21) && (sexo.equals("F")) && (experiencia.equals("S"))) {
					mulheres += 1; 
			}
			//■ a menor idade entre as mulheres que já têm experiência no serviço.
			if ((sexo.equals("F")) && (experiencia.equals("S"))) {
				if (idade < mulheres_menor)
					mulheres_menor = idade ;
			}
			
		}else { //■ o número de candidatos do sexo masculino; 
			cont_M += 1;
				//■ a idade média dos homens que já têm experiência no serviço; 
				if (experiencia.equals("S") && (sexo.equals("M"))) {
						media_H += idade; 
						total_homens_experientes++;
				}
				//■ a porcentagem dos homens com mais de 45 anos entre o total dos homens; 
				if ((idade > 45) && (sexo.equals("M"))) {
						homens_mais_45 += 1; 
		}
			
		}
		
		
		}while (idade != 0);
		
		if (total_homens_experientes > 0) {
			media_H = media_H / total_homens_experientes;
		}
		
		if (cont_M > 0) {
		    porcentagem_H = (homens_mais_45 * 100) / (float) cont_M;
		}
		
		System.out.println("Cadidatos Feminino sâo:" + cont_F);	
		System.out.println("Cadidatos Masculino sâo:" + cont_M);	
		System.out.println("A Idade Media dos Cadidatos Masculino Com Experiencia:" + media_H);
		System.out.println("A Porcentam dos Homens Acima de 45 anos:" + porcentagem_H + "%");
		System.out.println("A Mulheres inferior a 21 anos com Experiencia:" + mulheres);
		if (mulheres_menor == Integer.MAX_VALUE) {
		    System.out.println("Nenhuma mulher com experiência foi registrada.");
		} else {
		    System.out.println("A menor idade entre mulheres com experiência: " + mulheres_menor);
		}

	}

}
