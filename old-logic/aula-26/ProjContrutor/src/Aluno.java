public class Aluno {
    //valores
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private String escola;
    private double nota1;
    private double nota2;
    private int faltas;
    private Data nascimento;
    
    //METODOS
    
    //metodo contrutor
    public Aluno(){
        this.escola="Qi - Filial 02";
        this.endereco=new Endereco();
        this.nascimento=new Data();
        
    }
    
    //metodos get e set e toString

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nCPF: " + cpf + 
               "\nTelefone: " + telefone + 
               "\nEndereço: " + endereco + 
               "\nEscola: " + escola +
               "\nNota 1: " + nota1 + 
               "\nNota 2: " + nota2 + 
               "\nFaltas: " + faltas +
               "\nNascimento: " + nascimento;
    }
    //metodos calculos
    public double calcularMedia(){
        return (this.nota1+this.nota2)/2;
    }
    public double calcularFrequencia(int aulas){
        return (aulas-this.faltas)*100/aulas;
    }
    public String conceito(int aulas){
        double media=this.calcularMedia();
        double freq=this.calcularFrequencia(aulas);
        if(media>=6 && freq>=70){
            return "Aprovado!";
        }else if(media<6 && freq>=70){
            return "Reprovado por nota!";
        }else if(media>=6 && freq<70){
            return "Reprovado por falta!";
        }else{
            return "Reprovado geral!!";
        }
    }
}
