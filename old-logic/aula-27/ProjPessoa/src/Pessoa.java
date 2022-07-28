public class Pessoa {
    //valores
    private int codigo;
    private String nome;
    private String cpf;
    private Data data;
    private Endereco endereco;
    
    //metodos
    //metodo construtor
    public Pessoa(){
        this.endereco=new Endereco();
        this.data=new Data();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + codigo + 
               "\nNome: " + nome + 
               "\nCPF: " + cpf + 
               "\nData de nascimento: " + data + 
               "\nEndereço: " + endereco;
    }
    
}