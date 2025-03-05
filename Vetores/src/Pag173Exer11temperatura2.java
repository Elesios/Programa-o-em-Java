import java.util.*;

public class Pag173Exer11temperatura2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // Vetor para temperaturas e meses
        double[] temp = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                         "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        // Recebendo as temperaturas do usuário
        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            temp[i] = rand.nextInt(40);
            //temp[i] = scanner.nextDouble();
        }
        
        // Encontrando maior e menor temperatura
        double maior = temp[0];
        double menor = temp[0];
        int maior_mes = 0;
        int menor_mes = 0;
        
        for (int i = 1; i < 12; i++) {
            if (temp[i] > maior) {
                maior = temp[i];
                maior_mes = i;
            }
            if (temp[i] < menor) {
                menor = temp[i];
                menor_mes = i;
            }
        }
        
        // Exibindo resultados
        System.out.println("\nResultados:");
        System.out.println("Maior temperatura: " + maior + "°C");
        System.out.println("Ocorreu em: " + meses[maior_mes]);
        System.out.println("Menor temperatura: " + menor + "°C");
        System.out.println("Ocorreu em: " + meses[menor_mes]);
        
        scanner.close();
    }
}