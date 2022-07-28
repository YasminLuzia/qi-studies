public class Pessoa {
    //atributos
    private String nome;
    private String cpf;
    private byte diaNasceu;
    private byte mesNasceu;
    private int anoNasceu;
    
    //metodos(get/set e toString)
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

    public byte getDiaNasceu() {
        return diaNasceu;
    }

    public void setDiaNasceu(byte diaNasceu) {
        this.diaNasceu = diaNasceu;
    }

    public byte getMesNasceu() {
        return mesNasceu;
    }

    public void setMesNasceu(byte mesNasceu) {
        this.mesNasceu = mesNasceu;
    }

    public int getAnoNasceu() {
        return anoNasceu;
    }

    public void setAnoNasceu(int anoNasceu) {
        this.anoNasceu = anoNasceu;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nCPF: " + cpf + 
               "\nData de Nascimento: " + diaNasceu + "/" + mesNasceu + "/" + anoNasceu;
    }
    
    //metodos(calculos)
    public int calcularIdade(byte diaAtual, byte mesAtual, int anoAtual){
        if((this.mesNasceu>mesAtual) || (this.diaNasceu>diaAtual && this.mesNasceu==mesAtual)){
            return anoAtual-this.anoNasceu-1;
        }else{
            return anoAtual-this.anoNasceu;
        }
    }
}