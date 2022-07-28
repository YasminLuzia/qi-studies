
import java.util.Arrays;

public class Cadastro {
    private double[] salarios;
    
    public Cadastro(){
        this.salarios=new double[6];
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    @Override
    public String toString() {
        return "Cadastro: " + 
               "\nSalários: " +Arrays.toString(this.salarios);
    }
    
    public void cadastrarSalario(int indice, double salario){
        this.salarios[indice]=salario;
    }
    
    public double verPrimeiroSalario(){
        return this.salarios[0];
    }
    
    public double verUltimoSalario(){
        return this.salarios[this.salarios.length-1];
    }
    
    public double calcularMediaSalarios(){
        double acum=0;
        for(int i=0; i<this.salarios.length; i++){
            acum=acum+this.salarios[i];
        }
        return acum/this.salarios.length;
    }
}