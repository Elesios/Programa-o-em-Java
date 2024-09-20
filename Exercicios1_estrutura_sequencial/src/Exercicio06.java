import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C.
		 *  Em seguida, calcule e mostre: 
		 * a) a área do triângulo retângulo que tem A por base e C por altura. 
		 * b) a área do círculo de raio C.(pi = 3.14159) 
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. 
		 * e) a área do retângulo que tem lados A e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double A, B, C, area_triangulo,area_circulo, pi = 3.14159,area_trapezio;
		double area_do_quadrado, area_do_retangulo;
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		area_triangulo = (A * C) /2;
		area_circulo = pi * (Math.pow(C,2));
		area_trapezio = ((A+B) * C)/2;
		area_do_quadrado = B*B;
		area_do_retangulo = A*B;
		
		System.out.printf("\nArea do triangulo = %.3f ",area_triangulo);
		System.out.printf("\nArea do Circulo = %.3f ",area_circulo);
		System.out.printf("\nArea do trapezio = %.3f ",area_trapezio);
		System.out.printf("\nArea do quadrado = %.3f ",area_do_quadrado);
		System.out.printf("\nArea do retangulo = %.3f ",area_do_retangulo);
		
		scan.close();
	}

}
