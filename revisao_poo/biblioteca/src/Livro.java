public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int anoPublicacao;
    private String ISBN;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, String categoria, int anoPublicacao, String ISBN, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
        this.ISBN = ISBN;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void visualizar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}


