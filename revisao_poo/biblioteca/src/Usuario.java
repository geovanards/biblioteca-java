public class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String tipo;

    public Usuario(String nome, String endereco, String telefone, String email, String tipo){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.tipo = tipo;
    }
    
    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Tipo: " + tipo);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipo() {
        return tipo;
    }
}

