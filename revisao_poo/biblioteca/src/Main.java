import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        System.out.print("Quantos livros deseja adicionar? ");
        int numLivros = scanner.nextInt();
        scanner.nextLine(); 



        for (int i = 0; i < numLivros; i++) {
            System.out.println("Digite os detalhes do livro " + (i + 1) + ":");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Categoria: ");
            String categoria = scanner.nextLine();

            System.out.print("Ano de Publicação: ");
            int anoPublicacao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("ISBN: ");

            String ISBN = scanner.nextLine();
            System.out.print("Quantidade Disponível: ");

            int quantidadeDisponivel = scanner.nextInt();
            scanner.nextLine();

            Livro livro = new Livro(titulo, autor, categoria, anoPublicacao, ISBN, quantidadeDisponivel);
            biblioteca.adicionarLivro(livro);
        }

      
        System.out.println("\nDigite os detalhes do usuário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        Usuario usuario = new Usuario(nome, endereco, telefone, email, tipo);

    
        System.out.println("\nLivros disponíveis:");
        biblioteca.listarLivros();

       
        System.out.print("\nDigite o título do livro que deseja emprestar: ");
        String tituloEmprestimo = scanner.nextLine();
        Livro livroEmprestimo = null;

       
        for (Livro livro : biblioteca.getLivros()) {
            if (livro.getTitulo().equalsIgnoreCase(tituloEmprestimo)) {
                livroEmprestimo = livro;
                break;
            }
        }

        if (livroEmprestimo != null) {
            biblioteca.emprestarLivro(usuario, livroEmprestimo);
        } else {
            System.out.println("O livro não está disponível!");
        }

        
        System.out.println("\nLivros disponíveis após o empréstimo:");
        biblioteca.listarLivros();

        scanner.close();
    }
}
