public class Fornecedor {
    //valores
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    //metodos
    //metodo construtor
    public Fornecedor(){
        this.endereco=new Endereco();
    }
    
    //set get
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nCPF: " + cpf + 
               "\nEndereço: " + endereco;
    }
}