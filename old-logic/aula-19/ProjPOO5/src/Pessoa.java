public class Pessoa {
    //atributos
    public String nome;
    public double peso;
    public double altura;
    
    //metodos
    public double calcularIMC(){
        return this.peso/Math.sqrt(this.altura);
    }
    public String verPeso(){
        double imc = calcularIMC();
        if(imc>=18.5 && imc<25){
            return "Peso Normal";
        }else if(imc>=25 && imc<30){
            return "Acima do peso";
        }else if(imc>=30 && imc<35){
            return "Obesidade |";
        }else{
            return "Obesidade ||";
        }
    }
}