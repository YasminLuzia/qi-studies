public class Aluno {
    //variaveis
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    //metodos
    public double calcularMedia(){
        return (this.nota1+this.nota2+this.nota3)/3;
    }
    public String retornarConceito(){
        double media = calcularMedia();
        if(media<=2){
            return "RP - Conceito D";
        }else if(media>2 && media<6){
            return "RP - Conceito C";
        }else if(media>=6 && media<9){
            return "Ap - Conceito B";
        }else{
            return "Ap - Conceito A";
        }
    }
}
