public class Endereco {
    //valores
    private String cidade;
    private String estado;
    
    //métodos
    //set get
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
    
    //toString
    @Override
    public String toString() {
        return cidade + " / " + estado;
    }
    
}