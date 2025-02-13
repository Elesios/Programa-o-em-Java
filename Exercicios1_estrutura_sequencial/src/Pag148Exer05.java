import java.util.Scanner;
public class Pag148Exer05 {

	public static void main(String[] args) {
		
		final int loop = 10;
		Scanner scan = new Scanner(System.in);
		int tabuada = 0, resultado = 0;
		
		for (int i = 0 ; i <= loop ; i++){
			System.out.println ("\n-----------------------------------------");	
			for(int j = 0; j <= loop; j++) {
			resultado = i * j;
			System.out.printf("\n|Tabuada do: %d x %d = %d |",i, j, resultado );			
			}
			System.out.println ("\n-----------------------------------------");
		}
		}

	}
