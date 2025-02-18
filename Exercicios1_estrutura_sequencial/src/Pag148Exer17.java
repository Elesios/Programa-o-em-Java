import java.util.Scanner;
import java.util.Random;


/*
 * Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado 
dia. Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que 
estavam assistindo àquele canal. Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa 
não entrava na pesquisa. Faça um programa que: 
■ leia um número indeterminado de dados (número do canal e número de pessoas que estavam as
sistindo); e
 ■ calcule e mostre a porcentagem de audiência de cada canal. 
 */


public class Pag148Exer17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a audiência de cada canal
        int canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
        int totalPessoas = 0;

        System.out.println("Digite o número do canal e o número de pessoas assistindo (ou 0 para encerrar):");

        while (true) {
            System.out.print("Número do canal: ");
            int canal = scanner.nextInt();

            // Verifica se o usuário deseja encerrar a entrada de dados
            if (canal == 0) {
                break;
            }

            // Verifica se o canal é válido
            if (canal != 4 && canal != 5 && canal != 7 && canal != 12) {
                System.out.println("Canal inválido. Os canais válidos são 4, 5, 7 e 12.");
                continue;
            }

            System.out.print("Número de pessoas assistindo: ");
            int pessoas = scanner.nextInt();

            // Atualiza a audiência do canal correspondente
            if (canal == 4) {
                canal4 += pessoas;
            } else if (canal == 5) {
                canal5 += pessoas;
            } else if (canal == 7) {
                canal7 += pessoas;
            } else if (canal == 12) {
                canal12 += pessoas;
            }

            totalPessoas += pessoas;
        }

        scanner.close();

        // Calcula e exibe a porcentagem de audiência de cada canal
        System.out.println("\nPorcentagem de audiência por canal:");
        if (totalPessoas > 0) {
            System.out.printf("Canal 4: %.2f%%\n", (double) canal4 / totalPessoas * 100);
            System.out.printf("Canal 5: %.2f%%\n", (double) canal5 / totalPessoas * 100);
            System.out.printf("Canal 7: %.2f%%\n", (double) canal7 / totalPessoas * 100);
            System.out.printf("Canal 12: %.2f%%\n", (double) canal12 / totalPessoas * 100);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
