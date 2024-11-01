public class CadastroCliente {
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;

    // Construtor
    public CadastroCliente(String nome, String email, String senha, String endereco, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para validar o formato do e-mail
    public boolean validarEmail() {
        return email != null && email.contains("@") && email.contains(".");
    }

    // Método para validar o comprimento da senha
    public boolean validarSenha() {
        return senha != null && senha.length() >= 6;
    }

    // Método para validar o nome
    public boolean validarNome() {
        return nome != null && nome.length() >= 3;
    }

    // Método para exibir informações do cliente
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "E-mail: " + email + "\n" +
               "Endereço: " + endereco + "\n" +
               "Telefone: " + telefone;
    }

    // Método para simular cadastro
    public boolean cadastrarCliente() {
        if (validarEmail() && validarSenha() && validarNome()) {
            // Aqui você poderia inserir o cliente em um banco de dados ou enviar os dados para o servidor
            System.out.println("Cliente cadastrado com sucesso!");
            return true;
        } else {
            System.out.println("Erro no cadastro: verifique os dados inseridos.");
            return false;
        }
    }
}
