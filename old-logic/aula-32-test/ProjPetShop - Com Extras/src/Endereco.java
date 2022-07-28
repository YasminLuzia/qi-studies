public class Endereco {
    //valores
    private String rua;
    private String cidade;
    private String estado;
    private String complemento;
    private int numero;
    
    //metodos
    //set get
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString
    @Override
    public String toString() {
        return "\nRua: " + rua + 
               "\nCidade: " + cidade + 
               "\nEstado: " + estado + 
               "\nNúmero: " + numero +
               "\nComplemento: " + complemento;
    }
    
    //fim metodos
}