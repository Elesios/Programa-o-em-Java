import java.util.Scanner;

public class Pag136qExer18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num, quadrado, cubo;
        double raiz;

        do {
            // Entrada de um número
            System.out.println("Digite um número (ou um número negativo/zero para sair):");
            num = scan.nextFloat();
            
            // Se o número for negativo ou zero, sai do loop
            if (num <= 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Calcula o quadrado, cubo e raiz
            quadrado = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);

            // Exibe os resultados
            System.out.printf("\nNúmero digitado: %.2f", num);
            System.out.printf("\nQuadrado do número: %.2f", quadrado);
            System.out.printf("\nCubo do número: %.2f", cubo);
            System.out.printf("\nRaiz quadrada do número: %.2f\n", raiz);

        } while (num > 0);  // Continua enquanto o número for positivo

        scan.close();
    }
}
