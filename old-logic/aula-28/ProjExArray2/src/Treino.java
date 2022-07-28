
import java.util.Arrays;

public class Treino {
    private String nomeAtleta;
    private double[] marcas;
    
    public Treino(){
        this.marcas=new double [10];
    }
    
    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public double[] getMarcas() {
        return marcas;
    }

    public void setMarcas(double[] marcas) {
        this.marcas = marcas;
    }
    
    public void armazenarMarca(int numero, double marca){
        if(numero>=0 && numero<this.marcas.length){
            this.marcas[numero]=marca;
        }
    }
    
    public double calcularMediaDeMarcas(){
        double soma=0;
        for(int i=0;i<this.marcas.length; i++){
            soma=soma+this.marcas[i];
        }
        return soma/this.marcas.length;
    }
    
    public double obterMaiorMarca(){
        double maior=this.marcas[0];
        for(int i=1;i<this.marcas.length; i++){
            if(this.marcas[1]>maior){
                maior=this.marcas[1];
            }
        }
        return maior;
    }

    @Override
    public String toString() {
        return "Treino:" + 
               "\nNome do Atleta: " + nomeAtleta + 
               "\nMarcas: " + Arrays.toString(this.marcas);
    }
}