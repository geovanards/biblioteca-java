import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Biblioteca {
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livro.getQuantidadeDisponivel() > 0) {
            LocalDate dataEmprestimo = LocalDate.now();
            LocalDate dataDevolucaoPrevista = dataEmprestimo.plusDays(14); // 14 dias para devolução
            Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo, dataDevolucaoPrevista);
            emprestimos.add(emprestimo);
            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Desculpe, o livro não está disponível.");
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            livro.visualizar();
        }
    }
}


