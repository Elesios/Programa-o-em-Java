/*20. Faça um programa para ler o código, o sexo (M — masculino; F — feminino) e o número de horas/
aula dadas mensalmente pelos professores de uma universidade, sabendo-se que cada hora/aula vale 
R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em 
consideração os descontos explicados a seguir) de todos os professores. Mostre também a média dos 
salários líquidos dos professores do sexo masculino e a média dos salários líquidos dos professores do 
sexo feminino. Considere:
 ■ desconto para homens, 10%, e, para mulheres, 5%; 
 ■ as informações terminarão quando for lido o código = 99999.
 */

import java.util.Scanner;


public class Pag137Exer20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cod, horas_aulas, cont_M = 0, cont_F = 0;
		float salario_bruto, salario_liquido, media_M = 0, media_F = 0, media_M_total = 0, media_F_total = 0;
		String sexo; // = {"M", "F"};

		do {
		System.out.println("Digite o Cod do Funcionario:");
		cod = scan.nextInt();
		
		//garantir a saida antes de rodar o codigo
		if(cod == 99999) {
			System.out.println("Programa Finalizado:");
			break;
		}
		
		scan.nextLine(); // limpeza de buffer
		
		System.out.println("Digite o Sexo:");
		sexo = scan.nextLine().toUpperCase(); //Garantir que a letra sempre será maiuscula
		
		 // Valida se o sexo é válido (M ou F)
        if (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Sexo inválido! Digite 'M' para masculino ou 'F' para feminino.");
            continue; // Volta para o início do laço e solicita novamente
        }
		
		System.out.println("Digite as horas aulas trabalhabada:");
		horas_aulas = scan.nextInt();
		
		salario_bruto = 0;
		salario_liquido = 0;
		
		salario_bruto = horas_aulas * 30;
			if (sexo.equals("M")) {
				salario_liquido = salario_bruto - (salario_bruto * 0.10f);
				media_M += salario_liquido;
				cont_M +=1;				
				
			}else {
				salario_liquido = salario_bruto - (salario_bruto * 0.05f);
				media_F += salario_liquido;
				cont_F +=1;
				
			}
		
		System.out.println("Cod do Funcionario:" + cod);
		System.out.println("Salario Bruto do Funcionario:" + salario_bruto);
		System.out.println("Salario Liquido do Funcionario:" + salario_liquido);
		
		}while (cod != 99999);
		
		if(cont_M > 0) {
		media_M_total = media_M / cont_M;	
		}
		if (cont_F > 0) {
		media_F_total = media_F / cont_F;	
		}
		
		System.out.println("A media do salario dos Funcionario Masculino:" + media_M_total);
		System.out.println("A media do salario dos Funcionario Feminino:" + media_F_total);
		
		scan.close();
	}

}
