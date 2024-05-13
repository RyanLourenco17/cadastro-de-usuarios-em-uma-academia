import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String cpf;
    private String email;
    private String numeroTelefone;
    private Orcamento plano;

    public Usuario(String nome, String cpf, String email, String numeroTelefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
        this.plano = null;
    }
    
    // Adicione este construtor que aceita um objeto Orcamento
    public Usuario(String nome, String cpf, String email, String numeroTelefone, Orcamento plano) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Orcamento getPlano() {
        return plano;
    }

    public void setPlano(Orcamento plano) {
        this.plano = plano;
    }

    @Override
    public String toString() {
        String planoStr = (plano != null) ?plano.toString() : "Nenhum orçamento definido";
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", email='" + email + '\'' +
                ", telefone='" + numeroTelefone + '\'' +
                ", " + planoStr +
                '}';
    }
}
