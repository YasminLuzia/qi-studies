public class Aluno {
    
    //dados de entrada
    public String nome;
    public double nota1;
    public double nota2;
    
    //calculos
    public double calcularMedia(){
        return (this.nota1+this.nota2)/2;
    }
    public String verResultado(){
        if(calcularMedia()>=6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}