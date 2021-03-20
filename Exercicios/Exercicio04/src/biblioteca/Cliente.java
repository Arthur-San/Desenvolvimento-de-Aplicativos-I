package biblioteca;

public class Cliente {

    String nome;
    int idade;
    private int telefone;
    private String cpf;
    private double preco;

    public Cliente(String nome, int idade, int telefone, String cpf, double preco) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.preco = preco;
    }

    public Cliente()
    {
    
    }
    
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double verificarDesconto() 
    {
        /*
        se o cliente tiver 60 anos ou mais,         
        desconto de 20% na compra do livro á vista
        */
        if (this.idade >= 60) {
            preco = (preco * 0.2);
        } else {
            preco = 0;
        }
        return preco;
    }
    
    @Override
    public String toString(){
        return 
                "********SAÍDA DE DADOS********" + "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + " anos\n"
                + "Telefone: " + this.telefone + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Preço do livro a vista: R$" + this.preco +"\n";
    }

}
