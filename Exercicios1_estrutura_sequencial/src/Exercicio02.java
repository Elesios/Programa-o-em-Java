import java.util.Locale;
import java.util.Scanner;

	
public class Exercicio02 {
	public static void main(String[] args) {
		/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		*casas decimais conforme exemplos. Fórmula da área: area = π . raio2, Considere o valor de π = 3.14159
		*/
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		System.out.println("Digite o Valor do Raio de um circulo:");
		raio = scan.nextDouble();
		
		area = pi * (Math.pow(raio,2));
		System.out.printf("\nArea = %.4f ", area);
		
		scan.close();
		
}
}