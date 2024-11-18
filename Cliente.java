package src;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    // Construtor para inicializar o cliente com nome e cpf
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = ""; // Inicializando com um valor padrão
    }

    // Construtor para inicializar o cliente com nome, cpf e email
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // Getters e setters
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

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
