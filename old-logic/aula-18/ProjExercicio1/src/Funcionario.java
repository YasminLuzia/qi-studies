public class Funcionario {
    //atributos
    public String nome;
    public double numeroHoras;
    public double valorHora;
    
    //calculos
    public double calcularSalarioBruto(){
        return this.numeroHoras*this.valorHora;
    }
    public double calcularInss(){
        return this.calcularSalarioBruto()*0.08;
    }
    public double calcularValeTransporte(){
        return this.calcularSalarioBruto()*0.06;
    }
    public double calcularSalarioLiquido(){
        return this.calcularSalarioBruto()-this.calcularInss()-this.calcularValeTransporte();
    }
    
}