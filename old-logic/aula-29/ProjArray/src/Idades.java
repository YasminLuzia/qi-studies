
import java.util.Arrays;

public class Idades {
    private int[] idades;
    
    public Idades(){
        this.idades=new int[5];
    }

    @Override
    public String toString() {
        return "Idades: "+Arrays.toString(this.idades);
    }
    
    public void cadastrar(int indice, int idade){
        this.idades[indice]=idade;
    }
    
    //primeira idade
    public double verPrimeira(){
        return this.idades[0];
    }
    
    //ultima idade
    public double verUltima(){
        return this.idades[this.idades.length-1];
    }
    
    //calcular media
    public int calcularMedia(){
        int acum=0; //acum= somar
        for(int i=0; i<this.idades.length; i++){
            acum+=this.idades[i];
        }
        return acum/this.idades.length;
    }
    
    //maior idade
    public double verMaior(){
        int maior=this.idades[0];
        for(int i=0; i<this.idades.length; i++){
            if(this.idades[i]>maior){
                maior=this.idades[i];
            }
        }
        return maior;
    }
    
    //menor idade
    public double verMenor(){
        int menor=this.idades[0];
        for(int i=0; i<this.idades.length; i++){
            if(this.idades[i]<menor){
                menor=this.idades[i];
            }
        }
        return menor;
    }

    public int[] getIdades() {
        return idades;
    }

    public void setIdades(int[] idades) {
        this.idades = idades;
    }
    
    
}