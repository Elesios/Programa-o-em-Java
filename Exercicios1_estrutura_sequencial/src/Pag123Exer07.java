//Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.
//0-1-1-2-3-5-8-13-21-34-55
public class Pag123Exer07 {

	public static void main(String[] args) {
		int num, num2;
		
		num = 0;
		num2 = 1;
		
		System.out.println(+ num);
		System.out.println(+ num2);
		for ( int i = 2 ; i < 8; i++) {
			int fibonacci = num + num2;
			System.out.println(+ fibonacci);
			num = num2;
			num2 = fibonacci;
			
			
		}
		

	}

}