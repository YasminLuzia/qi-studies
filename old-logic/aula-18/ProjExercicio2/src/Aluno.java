public class Aluno {
    //valores
    public String nome;
    public double nota1;
    public double nota2;
    public double faltas;
    public double aulasAssitir;
    
    //metodos media e frequencia
    public double calcularMedia(){
        return (this.nota1+this.nota2)/2;
    }
    public double calcularFrequencia(){
        return this.faltas*100/this.aulasAssitir;
    }
}