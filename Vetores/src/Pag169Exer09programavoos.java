import java.util.Scanner;
import java.util.Arrays;

public class Pag169Exer09programavoos {

	public static void main(String[] args) {

		final int tam = 3;
		Scanner scan = new Scanner(System.in);

		int opcao = 0, consulta = 0, voo = 0;
		String origem_voo, destino_voo;
		int[] numero_voos = new int[tam];
		String[] Origem = new String[tam];
		String[] Destino = new String[tam];
		int[] numero_lugares = new int[tam];

		for (int i = 0; i < tam; i++) {
			System.out.print("\nNumero do voo:");
			numero_voos[i] = scan.nextInt();
			System.out.print("\nOrigem:");
			Origem[i] = scan.next();
			System.out.print("\nDestino:");
			Destino[i] = scan.next();
			System.out.print("\nNumero de Lugares:");
			numero_lugares[i] = scan.nextInt();
		}
		System.out.println("\n-------------------------------:");
		System.out.println("===========Menu============:");
		System.out.println("[1] Consultar:");
		System.out.println("[2] Efetuar Reserva:");
		System.out.println("[3] Sair:");
		System.out.println("\n-------------------------------:");

		opcao = scan.nextInt();

		switch (opcao) {
		case 1: {
			System.out.println("[1]Consulta Numero de Voo:");
			System.out.println("[2]Consulta Por Origem:");
			System.out.println("[3]Consulta Por Destino:");
			consulta = scan.nextInt();
			if (consulta == 1) {
				int i = 0;
				System.out.println("Digite o numero do voou");
				voo = scan.nextInt();
				while (i < tam && numero_voos[i] != voo) {
					i++;
				}
				if (i == tam) {
					System.out.println("\nVoo Inexistente:");
				} else {
					System.out.println("\n-------------------------------:");
					System.out.println("Numero do Voo: " + numero_voos[i]);
					System.out.println("Origem Do Voo: " + Origem[i]);
					System.out.println("Destino do Voo: " + Destino[i]);
					System.out.println("Lugares: " + numero_lugares[i]);
					System.out.println("\n-------------------------------:");

				}
			}

			if (consulta == 2) {
				int i = 0;
				System.out.println("Digite a Origem");
				scan.nextLine();
				origem_voo = scan.next();
				while (i < tam && !Origem[i].equalsIgnoreCase(origem_voo)) {
					i++;
				}
				if (i == tam) {
					System.out.println("\nVoo Inexistente:");
				} else {
					System.out.println("\n-------------------------------:");
					System.out.println("Numero do Voo: " + numero_voos[i]);
					System.out.println("Origem Do Voo: " + Origem[i]);
					System.out.println("Destino do Voo: " + Destino[i]);
					System.out.println("Lugares: " + numero_lugares[i]);
					System.out.println("\n-------------------------------:");

				}
			}

			if (consulta == 3) {
				int i = 0;
				System.out.println("Digite o Destino");
				scan.nextLine();
				destino_voo = scan.next();
				while (i < tam && !Destino[i].equalsIgnoreCase(destino_voo)) {
					i++;
				}
				if (i == tam) {
					System.out.println("\nVoo Inexistente:");
				} else {
					System.out.println("\n-------------------------------:");
					System.out.println("Numero do Voo: " + numero_voos[i]);
					System.out.println("Origem Do Voo: " + Origem[i]);
					System.out.println("Destino do Voo: " + Destino[i]);
					System.out.println("Lugares: " + numero_lugares[i]);
					System.out.println("\n-------------------------------:");
				}
			}
			break;
		}
		case 2: {
			System.out.println("Efetuar Reserva:");
			System.out.println("Digite o Voo Desejado:");
			voo = scan.nextInt();
			int i = 0;
			System.out.println("Digite o numero do voou");
			voo = scan.nextInt();
			while (i < tam && numero_voos[i] != voo) {
				i++;
			}
			if (i == tam) {
				System.out.println("\nVoo Inexistente:");
			}else {
				if(numero_lugares[i] == 0) {
					System.out.println("\nVoo Lotado:");
				}else {
					numero_lugares[i]--;;
					System.out.println("\nReserva Confirmada:");
				}
			}
			break;
		}
		case 3:{
			System.out.println("\nPrograma Encerrado:");
			break;
		}
			

		}// Switch

	}
}// fim
