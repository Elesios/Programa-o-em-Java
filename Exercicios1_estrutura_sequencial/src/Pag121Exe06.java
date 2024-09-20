

import java.util.Scanner;

public class Pag121Exe06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float codico, num_horas_trab, valor_hora = 0, Salario_minimo = 450, auxilio = 0;
		char turno_trab,categoria ;
		
		/*a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informados turnos e 
		 * nem categorias inexistentes. Trabalhe sempre com a digitação de letras maiúsculas. */
		
		System.out.println("Digite o Codico do funcionario:");
		codico = scan.nextFloat();
		System.out.println("Digite a quantidade de horas trabalhada deste funcionario:");
		num_horas_trab = scan.nextFloat();
		System.out.println("Digite o turno de Trabalho (M — matutino; V — vespertino; ou N — noturno) em maiusculo:");
		turno_trab = scan.next().toUpperCase().charAt(0);
		
		while(turno_trab != 'M' && turno_trab != 'V' && turno_trab != 'N') {
		    System.out.println("Digite o turno de Trabalho (M — matutino; V — vespertino; ou N — noturno) em maiusculo:");
		    turno_trab = scan.next().toUpperCase().charAt(0); 
		}
		
		System.out.println("Digite a categoria (O - operário ou G — gerente):");
		categoria = scan.next().toUpperCase().charAt(0);
		while(categoria != 'O' && categoria != 'G') {
			System.out.println("Digite a categoria (O - operário ou G — gerente):");
		    categoria = scan.next().toUpperCase().charAt(0); 
		}
		//Salario minimo 450,00
		/*b) Calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor de R$ 450,00 para o salário 
		mínimo*/
			if(categoria == 'G' && turno_trab == 'N') {
				valor_hora = Salario_minimo * 0.18f; 
			}else if ((categoria == 'G' && turno_trab == 'M')||(categoria == 'G' && turno_trab == 'V')){
				valor_hora = Salario_minimo * 0.15f;
			}else if(categoria == 'O' && turno_trab == 'N') {
				valor_hora = Salario_minimo * 0.13f; 
			}else if ((categoria == 'O' && turno_trab == 'M')||(categoria == 'O' && turno_trab == 'V')){
				valor_hora = Salario_minimo * 0.10f;
			}
		//c) Calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas. 	
			float salario_inicial = num_horas_trab * valor_hora;
			
		/*d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo com seu salário inicial, conforme 
			a tabela a seguir. */
			if (salario_inicial < 900.00) {
				auxilio += (salario_inicial * 0.20f);
			}
			else if (salario_inicial >= 900.00 && salario_inicial <= 1600.00) {
				auxilio += (salario_inicial * 0.15f);
			}else if (salario_inicial > 1600.00) {
				auxilio += (salario_inicial * 0.05f);
				}
			float salario_final = auxilio + salario_inicial;
		/*e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio alimentação 
			e salário final (salário inicial + auxílio alimentação). */	
			System.out.println("Codico do Funcioanrio:" + codico);
			System.out.println("Numero de horas Trabalhada:" + num_horas_trab);
			System.out.println("Valor das horas Trabalhada:" + valor_hora);	
			System.out.println("Salario Inicial:" + salario_inicial);
			System.out.println("Auxilio alimentracao:" + auxilio);
			System.out.println("Salario Final:" + salario_final);
			
			scan.close();
	}

}
