public class Vendedor {
    //variaveis
    public String nome;
    public double vendasJaneiro;
    public double vendasFevereiro;
    public double vendasMarco;
    
    //metodos
    public double calcularMedia(){
        return (this.vendasFevereiro+this.vendasJaneiro+this.vendasMarco)/3;
    }
    public String verDesempenho(){
        double md = calcularMedia();
        if(md<=1000){
            return "Péssimo vendedor";
        }else if(md>1000 || md<=2500){
            return "Vendedor desmotivado";
        }else if(md>2500 || md<=5000){
            return "Vendedor bom";
        }else{
            return "Ótimo vendedor";
        }
    }
    
}