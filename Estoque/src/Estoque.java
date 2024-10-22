import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Estoque {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();  // Lista para armazenar os produtos

        // Adiciona 10 produtos eletrônicos automaticamente ao iniciar o sistema
        adicionarDezItensEletronicos(produtos);
        
        int opcao = 0;
        
        while (opcao != 5) {  // Para parar no 5, que é a opção "Sair"
            System.out.printf("\nGerenciamento de Estoque:\n");
            System.out.println("Digite a Opção desejada:");
            System.out.println("1 - Cadastrar Novos Produtos");
            System.out.println("2 - Atualização de Estoque");
            System.out.println("3 - Rastreamento de Localização");
            System.out.println("4 - Relatórios");
            System.out.println("5 - Sair");
            
            opcao = scan.nextInt();
            scan.nextLine(); // Consumir nova linha
            
            if (opcao == 1) {
                // Chama a função para cadastrar produto
                Produto produto = cadastrarProduto(scan);
                produtos.add(produto);  // Adiciona o produto na lista
            } else if (opcao == 2) {
                // Atualizar estoque
                atualizarEstoque(produtos, scan);
            } else if (opcao == 3) {
                // Chama a função para rastreamento de localização
                rastrearLocalizacao(produtos, scan);
            } else if (opcao == 4) {
                // Listar produtos (relatórios)
                listarProdutos(produtos);
            } else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scan.close();  // Fechar o scanner após sair do loop
    }

    // Classe Produto
    static class Produto {
        String nome;
        String categoria;
        String localizacao;
        int quantidade_estoque;
        float preco;

        // Construtor
        public Produto(String nome, String categoria, String localizacao, int quantidade_estoque, float preco) {
            this.nome = nome;
            this.categoria = categoria;
            this.localizacao = localizacao;
            this.quantidade_estoque = quantidade_estoque;
            this.preco = preco;
        }
    }

    // Função para cadastrar produto
    public static Produto cadastrarProduto(Scanner scan) {
        System.out.println("Digite o Nome do Produto:");
        String nome = scan.nextLine();
        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase(); // Garante a primeira letra maiúscula

        System.out.println("Digite a Categoria do Produto:");
        String categoria = scan.nextLine();

        System.out.println("Digite a Localização do Produto:");
        String localizacao = scan.nextLine();

        System.out.println("Digite a Quantidade em Estoque:");
        int quantidade_estoque = scan.nextInt();
        scan.nextLine();  // Consumir a nova linha restante após o número

        System.out.println("Digite o Preço do Produto:");
        float preco = scan.nextFloat();
        scan.nextLine();  // Consumir a nova linha restante após o número

        Produto novoProduto = new Produto(nome, categoria, localizacao, quantidade_estoque, preco);
        System.out.printf("Produto cadastrado com sucesso:\n" +
                          "Nome: %s\n" +
                          "Categoria: %s\n" +
                          "Localização: %s\n" +
                          "Quantidade: %d\n" +
                          "Preço: R$ %.2f\n", nome, categoria, localizacao, quantidade_estoque, preco);

        return novoProduto;
    }

    // Função para atualizar estoque
    public static void atualizarEstoque(List<Produto> produtos, Scanner scan) {
        System.out.println("Digite o Nome do Produto para atualizar o estoque:");
        String nomeProduto = scan.nextLine();

        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado: " + produto.nome);
                System.out.println("Quantidade atual em estoque: " + produto.quantidade_estoque);

                System.out.println("Digite 1 para adicionar itens ao estoque (recebimento) ou 2 para remover itens (venda):");
                int opcaoAtualizar = scan.nextInt();
                scan.nextLine(); // Consumir nova linha

                if (opcaoAtualizar == 1) {
                    // Adicionar itens ao estoque (recebimento)
                    System.out.println("Digite a quantidade de itens a adicionar:");
                    int adicionarQuantidade = scan.nextInt();
                    scan.nextLine();  // Consumir nova linha
                    produto.quantidade_estoque += adicionarQuantidade;
                    System.out.println("Estoque atualizado! Nova quantidade: " + produto.quantidade_estoque);
                } else if (opcaoAtualizar == 2) {
                    // Remover itens do estoque (venda)
                    System.out.println("Digite a quantidade de itens a remover:");
                    int removerQuantidade = scan.nextInt();
                    scan.nextLine();  // Consumir nova linha

                    // Verificar se a quantidade a ser removida é menor ou igual ao estoque atual
                    if (removerQuantidade <= produto.quantidade_estoque) {
                        produto.quantidade_estoque -= removerQuantidade;
                        System.out.println("Estoque atualizado! Nova quantidade: " + produto.quantidade_estoque);
                    } else {
                        System.out.println("Erro: A quantidade a ser removida é maior que a quantidade em estoque.");
                    }
                } else {
                    System.out.println("Opção inválida! Escolha 1 para adicionar ou 2 para remover.");
                }

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // Função para rastrear localização
    public static void rastrearLocalizacao(List<Produto> produtos, Scanner scan) {
        System.out.println("Digite o Nome do Produto para rastrear a localização:");
        String nomeProduto = scan.nextLine();

        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.nome.equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado: " + produto.nome);
                System.out.println("Localização do Produto: " + produto.localizacao);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    // Função para listar produtos (relatórios)
    public static void listarProdutos(List<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos Cadastrados:");
            for (Produto produto : produtos) {
                System.out.printf("Nome: %s\nCategoria: %s\nLocalização: %s\nQuantidade: %d\nPreço: R$ %.2f\n\n", 
                                  produto.nome, produto.categoria, produto.localizacao, 
                                  produto.quantidade_estoque, produto.preco);
            }
        }
    }

    public static void adicionarDezItensEletronicos(List<Produto> produtos) {
        Random random = new Random();
        
        // Lista de nomes de produtos eletrônicos
        String[] nomesProdutos = {
            "Mouse", "Teclado", "Monitor", "Impressora", "Notebook",
            "HD Externo", "Pen Drive", "Câmera", "Smartphone", "Tablet"
        };

        // Lista de possíveis localizações
        String[] depositos = {"Depósito A", "Depósito B", "Depósito C"};
        
        for (int i = 0; i < 10; i++) {
            String nome = nomesProdutos[i];  // Nome do produto da lista
            String localizacao = depositos[random.nextInt(depositos.length)]  // Depósito aleatório
                    + ", Prateleira Coluna " + (random.nextInt(5) + 1)  // Coluna entre 1 e 5
                    + " - Linha " + (random.nextInt(3) + 1);  // Linha entre 1 e 3
            int quantidade_estoque = random.nextInt(500) + 1;  // Quantidade em estoque aleatória entre 1 e 500
            float preco = random.nextFloat() * 100 + 50;  // Preço aleatório entre 50 e 150

            // Adiciona o novo produto à lista de produtos
            Produto novoProduto = new Produto(nome, "Eletrônicos", localizacao, quantidade_estoque, preco);
            produtos.add(novoProduto);
        }
        
        System.out.println("10 produtos da categoria Eletrônicos foram adicionados automaticamente!");
    }
}
