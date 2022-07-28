public class Calculadora {
    //atributos;
    public double numero1;
    public double numero2;
    
    //metodos;
    public double somar(){
        return this.numero1+this.numero2;
    }
    public double multiplicar(){
        return this.numero1*this.numero2;
    }
    public double calcularMedia(){
        return somar()/2;
    }
    
}
