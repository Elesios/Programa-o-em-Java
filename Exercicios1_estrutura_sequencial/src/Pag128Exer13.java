import java.util.Scanner;
import java.util.Random;


public class Pag128Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int nascida = 0, mortas, periodo, tempo_vida, dias, sexo_M = 0, sexo_F = 0, cont_M = 0, cont_F = 0, cont_viveram = 0;
		int nasci_total =0 ;
		String[] sexo = {"M","F"};
		
		System.out.println("Digite o Periodo em meses:");
		periodo = scan.nextInt();
		dias = periodo * 30;
		
		for (int i = 0; i <= dias ; i++) {
			nascida = rand.nextInt(20);			
			int indexAleatorio = rand.nextInt(sexo.length);
			String generoAleatorio = sexo[indexAleatorio];
			tempo_vida = rand.nextInt(dias);
			if (tempo_vida <= (365 * 2)) {
				 cont_viveram ++;
			}
			if (generoAleatorio.equals("M")) {
				sexo_M += nascida;
				cont_M +=1;
			}else {
				sexo_F += nascida;
				cont_F +=1;
		
			}
			nasci_total += nascida;
		}
		
		double total = cont_M + cont_F; // Total de nascimentos
        double porc_F = (cont_F / total) * 100; // Porcentagem de femininos
        double porc_M = (cont_M / total) * 100; // Porcentagem de masculinos
        double porc_Nascido = (cont_viveram / total) * 100;
		
        System.out.printf("Criança Nascida no periode de: %d \n Do Sexo M:%d \n Do Sexo F: %d" , nasci_total , sexo_M , sexo_F );
		System.out.printf("\nA percentagem crianças do sexo feminino mortas no período: %.2f%%" , porc_F);
		System.out.printf("\nA percentagem crianças do sexo Masculino mortas no período:%.2f%%", porc_M);
		System.out.printf("\nA percentagem de crianças que viveram 24 meses ou menos no período. :%.2f%%", porc_Nascido);
		
	}

}
