import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    int id;
    String nome;
    String categoria;
    int quantidade;
    double preco;
    String localizacao;

    Produto(int id, String nome, String categoria, int quantidade, double preco, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Categoria: " + categoria + ", Quantidade: " + quantidade + ", Preco: " + preco + ", Localizacao: " + localizacao;
    }
}

class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private int contadorProdutos = 0;

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Categoria: ");
        String categoria = scanner.nextLine();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preco: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Localizacao no deposito: ");
        String localizacao = scanner.nextLine();

        Produto p = new Produto(++contadorProdutos, nome, categoria, quantidade, preco, localizacao);
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Cadastrar Produto\n2. Listar Produtos\n3. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    estoque.cadastrarProduto();
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 3);
    }
}
