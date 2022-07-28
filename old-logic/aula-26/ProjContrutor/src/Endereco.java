public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    
    //MÉTODOS
    
    //metodo construtor
    public Endereco(){
        this.estado="RS";
    }
    
    //SetGet e to String
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "\nEndereço: " + rua + ", " + numero + " - " + cidade + " / " + estado;
    }
    
    
}
