/*5. Faça um programa que leia o número de termos e um valor positivo para X. Calcule e mostre o valor
da série a seguir:
S = -X2 +X3 –X4 +X5 -X6 +X7 -X8 +X9 -X10 +X11 -...
	 1!  2!  3!  4!  3!  2!   1! 2!   3!  4!
*/

import java.util.Scanner;

public class Pag120Exer05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, numeros_termos, termo = 0, expoente; // Inicializa 'termo' com 0
        int denominador = 1, fat;

        System.out.println("Digite o numero de Termos:");
        numeros_termos = scan.nextInt();
        System.out.println("Digite o numero para X:");
        x = scan.nextInt();

        for (int i = 0; i < numeros_termos; i++) {
            // Calcula o fatorial (corrigindo a condição do loop)
            fat = 1;
            for (int j = 2; j <= denominador; j++) { // <= em vez de >=
                fat = fat * j;
            }

            expoente = i + 2;

            // Calcula o termo da série com o sinal correto
            int sinal = (i % 2 == 0) ? -1 : 1;
            termo += sinal * Math.pow(x, expoente) / fat; // Usa 'termo' em vez de declarar um novo 'termo'

            denominador++;
            if (denominador > 4) {
                denominador = 1;
            }
        }

        // Imprime o resultado fora do loop
        System.out.println("O valor da série é: " + termo);

        scan.close();
    }
}
