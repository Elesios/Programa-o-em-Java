import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		decimais
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int Numero_funcionario;
		double Horas_trab,Valor_hora , Salario;
		
		Numero_funcionario = scan.nextInt();
		Horas_trab = scan.nextDouble();
		Valor_hora = scan.nextDouble();
		
		Salario = Horas_trab * Valor_hora;
		
		System.out.printf ("\nNumero do Funcionario: %d \n", Numero_funcionario);
		System.out.printf ("\nSalario deste Funcionario:R$ %.2f \n", Salario);
		scan.close();
	}

}