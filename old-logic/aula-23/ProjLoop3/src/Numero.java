public class Numero {
    private int numero1;

    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    @Override
    public String toString() {
        return "Número: "+ numero1;
    }
    
    public int calcularTabuada(int cont){
        return this.numero1*cont;
    }
    
    public int calcularFatorial(){
        int acum=1;
        int cont=1;
        while(cont<=this.numero1){
            acum*=cont;//ou acum= acum* cont
            cont++;
        }
        return acum;
    }
    
    public int calcularSomatorio(){
        int acum=0;
        int cont=1;
        while(cont<=this.numero1){
            acum+=cont;
            cont++;
        }
        return acum;
    }
}