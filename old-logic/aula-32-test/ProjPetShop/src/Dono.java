public class Dono {
    //valores
    private String nome;
    private String cpf;
    private String rg;
    private Endereco endereco;
    private Data dataNascimento;
    
    //métodos
    //metodo construtor
    public Dono(){
        this.endereco=new Endereco();
        this.dataNascimento=new Data();
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

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //toString
    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nRG: " + rg +
               "\nCPF: " + cpf + 
               "\nEndereço: " + endereco + 
               "\nData de nascimento: " + dataNascimento;
    }
    
    //fim métodos
}