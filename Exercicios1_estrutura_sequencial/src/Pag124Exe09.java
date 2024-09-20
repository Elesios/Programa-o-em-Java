import java.util.Scanner;
import java.util.Locale;

public class Pag124Exe09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		float nota1, nota2, media, aprovados = 0, reprovados = 0 , exame = 0, media_classe = 0;
		
		System.out.println("MÉDIA ARITMÉTICA:");
		System.out.println("Até 3 = Reprovado:");
		System.out.println("Entre 3 e 7 = Exame:");
		System.out.println("Acima 7 = Aprovado:");
		
		for(int i = 0; i < 6; i++) {
		System.out.println("Digite a Primeira e Segunda Nota:");
		nota1 = scan.nextFloat();
		nota2 = scan.nextFloat();
		
		// ■ a média aritmética das duas notas de cada aluno
		media = (nota1 + nota2)/2.0f;
		System.out.println("Media = " + media);
		
		if (media > 7.0) {
			aprovados++;
			}
			else if ( media > 3.0 && media <= 7.0) {
				exame++;
			}else
				reprovados++;
		media_classe += media;			
		}	
		float classe = media_classe / 6.0f;
		
		System.out.printf("\nAlunos Aprovado = %.2f ",aprovados);
		System.out.printf("\nAlunos Reprovado = %.2f ", reprovados);
		System.out.printf("\nAlunos de Exame = %.2f ", exame);
		System.out.printf("\nMedia da Classe = %.2f ", classe);
	}
		
}


