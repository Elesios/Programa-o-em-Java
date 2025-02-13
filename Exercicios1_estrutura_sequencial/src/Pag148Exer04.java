import java.util.Scanner;
public class Pag148Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int tabuada = 0, resultado = 0;
		
		System.out.print("Digite um numero:");
		tabuada = scan.nextInt();
		
		for (int i = 0 ; i < 11 ; i++){
			resultado = i * tabuada;
			System.out.printf("\nTabuada do: %d = %d",tabuada, resultado );
			}
		}

	}


