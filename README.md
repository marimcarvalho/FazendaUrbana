# Fazenda Urbana

## Descrição

"Fazenda Urbana" é uma aplicação Java com interface gráfica (Swing) para a gestão de uma fazenda urbana. O sistema permite que administradores e clientes realizem diversas operações, como cadastro de fornecedores e clientes, consulta de produtos, relatórios de vendas e produção, além de gerenciamento de estoque e pagamentos. A aplicação é projetada para facilitar a gestão de um ecossistema urbano voltado para a produção e venda de produtos agrícolas.

## Funcionalidades

### **Login**
- **Administrador**:
  - Cadastrar fornecedores e clientes.
  - Gerenciar estoque de produtos.
  - Consultar relatórios de vendas, produção e estoque.
  
- **Cliente**:
  - Visualizar produtos disponíveis.
  - Realizar compras e simular pagamentos (PIX, débito, crédito).
  - Emitir nota fiscal de compras realizadas.

### **Administração**
- O **Administrador** pode:
  - Cadastrar **fornecedores** e **clientes**.
  - Gerenciar **estoque** de produtos.
  - Visualizar **relatórios** de vendas e produção.
  - Consultar a lista de **fornecedores** e **clientes**.

### **Cliente**
- O **Cliente** pode:
  - Visualizar os **produtos** disponíveis.
  - Realizar **compras** e simular pagamentos por **PIX**, **débito** ou **crédito**.
  - Gerar **nota fiscal** para cada compra.

### **Relatórios**
- Relatórios para o **Administrador** visualizarem as vendas, a produção e o estoque atual.
- Relatórios exibidos em tabelas com a possibilidade de exportação de dados.

## Tecnologias Utilizadas

- **Java** - Linguagem principal utilizada para o desenvolvimento.
- **Swing** - Para a criação da interface gráfica.
- **JTable** - Para exibir dados em formato tabular (relatórios, lista de fornecedores e clientes).
- **JFileChooser** (opcional) - Para exportação de relatórios para CSV ou outros formatos.

## Instalação

### Requisitos

- **Java 8 ou superior** instalado.
  - Para verificar se o Java está instalado, execute o comando:
    ```bash
    java -version
    ```

### Passos para executar o projeto

1. **Baixar o projeto**
   - Clone o repositório para sua máquina local:
     ```bash
     git clone https://github.com/seu-usuario/fazenda-urbana.git
     ```

2. **Compilar e executar**
   - Abra o projeto em sua IDE favorita (Eclipse, IntelliJ, NetBeans) ou use o terminal:
     - Compile e execute o arquivo `FazendaUrbana.java` (classe com o `main`).
     - O programa será iniciado com a tela de login.

### Estrutura do Projeto


### Como Rodar a Tela de Login

O método `main` está implementado em `FazendaUrbana.java`. Para executar a aplicação, basta chamar a classe `FazendaUrbana` para iniciar o sistema de login:

```java
public class FazendaUrbana {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginScreen();  // Inicia a tela de login
        });
    }
}
