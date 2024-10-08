import java.util.Scanner;
import java.util.Random;

public class Pag130Exer15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		float valor_produto, estoque = 0, imposto = 0, preco_final = 0, media_valores_adicionado = 0,
				valores_adicionado = 0, maior_preco_final = 0, menor_preco_final = 0;
		float total_imposto = 0;
		String[] categorias = { "A", "L", "V" }, refrigeracao = { "S", "N" };
		String categoriaAleatorio, refrigeracaoAleatorio, classificacao = "";
		int barato = 0, normal = 0, caro = 0;

		for (int i = 0; i < 120; i++) {
			System.out.printf("------------------------------------------------------\n");
			System.out.printf("Digite o Valor do Produto:%d\n", (i+1));
			valor_produto = 1 + rand.nextFloat() * (150);

			// Geração automática da categoria
			int indexCategoriaAleatorio = rand.nextInt(categorias.length);
			categoriaAleatorio = categorias[indexCategoriaAleatorio];

			System.out.println("Categoria selecionada: " + categoriaAleatorio);

			valores_adicionado = 0;
			imposto = 0;

			switch (categoriaAleatorio) {
			case "A":
				// Geração automática da refrigeração
				int indexRefrigeracaoAleatorio = rand.nextInt(refrigeracao.length);
				refrigeracaoAleatorio = refrigeracao[indexRefrigeracaoAleatorio];

				System.out.println("Refrigeração selecionada: " + refrigeracaoAleatorio);

				if (refrigeracaoAleatorio.equals("S") && valor_produto > 20 && valor_produto <= 50) {
					estoque = 6.00f;
				} else if (refrigeracaoAleatorio.equals("N") && valor_produto > 20 && valor_produto <= 50) {
					estoque = 0;
				} else if (refrigeracaoAleatorio.equals("S") && valor_produto > 50) {
					estoque = 5.00f;
				} else if (refrigeracaoAleatorio.equals("N") && valor_produto > 50) {
					estoque = 0;
				}

				if (refrigeracaoAleatorio.equals("S")) {
					imposto = valor_produto * 0.04f;

				} else {
					imposto = valor_produto * 0.02f;

				}

				preco_final = valor_produto + imposto + estoque;

				if (preco_final < 20.0) {
					classificacao = "Barato";
					barato += 1;
					estoque = 2.00f;
				} else if (preco_final > 20.0 && preco_final <= 100) {
					classificacao = "Normal";
					normal += 1;
				} else if (preco_final > 100) {
					classificacao = "Caro";
					caro += 1;
				}
				break;
			case "L":
				estoque = 3.00f;
				imposto = valor_produto * 0.02f;
				preco_final = valor_produto + imposto + estoque;

				if (preco_final < 20.0) {
					classificacao = "Barato";
					barato += 1;
				} else if (preco_final > 20.0 && preco_final <= 100) {
					classificacao = "Normal";
					normal += 1;
				} else if (preco_final > 100) {
					classificacao = "Caro";
					caro += 1;
				}
				break;

			case "V":
				estoque = 4.00f;
				imposto = valor_produto * 0.02f;
				preco_final = valor_produto + imposto + estoque;
				if (preco_final < 20.0) {
					classificacao = "Barato";
					barato += 1;
				} else if (preco_final > 20.0 && preco_final <= 100) {
					classificacao = "Normal";
					normal += 1;
				} else if (preco_final > 100) {
					classificacao = "Caro";
					caro += 1;
				}
				break;
			default:
				System.out.println("Categoria inválida");
			}

			valores_adicionado = imposto + estoque;
			media_valores_adicionado += valores_adicionado;
			total_imposto += imposto;

			if (preco_final > maior_preco_final) {
				maior_preco_final = preco_final;
			}
			if (preco_final < menor_preco_final || menor_preco_final == 0) {
				menor_preco_final = preco_final;
			}

			System.out.printf("Custo ddo produto: %.2f%n", valor_produto);
			System.out.printf("Custo de Estocagem: %.2f%n", estoque);
			System.out.printf("Custo do imposto: %.2f%n", imposto);
			System.out.printf("Custo Final do Produto: %.2f%n", preco_final);

		}
		System.out.printf("Custo total dos impostos: %.2f%n", total_imposto);
		System.out.printf("Media dos Valores Adicionado: %.2f%n", media_valores_adicionado);
		System.out.printf("A quantidade de produtos com classificação barato: %d%n", barato);
		System.out.printf("A quantidade de produtos com classificação normal: %d%n", normal);
		System.out.printf("A quantidade de produtos com classificação caro: %d%n", caro);
		System.out.printf("------------------------------------------------------\n");
	}
}
