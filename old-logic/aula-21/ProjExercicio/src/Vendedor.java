public class Vendedor {
    //atributos
    private String nome;
    private double vendasJaneiro;
    private double vendasFevereiro;
    private double vendasMarco;
    //private shit
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendasJaneiro() {
        return vendasJaneiro;
    }

    public void setVendasJaneiro(double vendasJaneiro) {
        this.vendasJaneiro = vendasJaneiro;
    }

    public double getVendasFevereiro() {
        return vendasFevereiro;
    }

    public void setVendasFevereiro(double vendasFevereiro) {
        this.vendasFevereiro = vendasFevereiro;
    }

    public double getVendasMarco() {
        return vendasMarco;
    }

    public void setVendasMarco(double vendasMarco) {
        this.vendasMarco = vendasMarco;
    }

    //metodos
    public double calcularMedia(){
        return (this.vendasJaneiro+this.vendasFevereiro+this.vendasMarco)/3;
    }
    public double calcularComissao(){
        double media=calcularMedia();
        if(media<=1000){
            return media*0.01;
        }else if(media>1000 && media<=3500){
            return media*0.02;
        }else if(media>3500 && media<=5000){
            return media*0.05;
        }else if(media>5000 && media<=10000){
            return media*0.08;
        }else{
            return media*0.1;
        }
    }

    @Override
    public String toString() {
        return "Vendedor: " + 
               "\nNome: " + nome + 
               "\nVendas Janeiro: R$" + vendasJaneiro +
               "\nVendas Fevereiro: R$" + vendasFevereiro + 
               "\nVendas Março: R$" + vendasMarco;
    }
}