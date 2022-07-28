public class Calculo {
    //Atributos:
    private double numero1;
    private double numero2;

    @Override
    public String toString() {
        return "Calculo:" + 
               "\nNúmero 1: " + numero1 + 
               "\nNúmero 2: " + numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //Métodos:
    public double somar(){
        return this.numero1+this.numero2;
    }
    public double multiplicar(){
        return this.numero1*this.numero2;
    }
    public double dividir(){
        return this.numero1/this.numero2;
    }
    public double calcularMedia(){
        return this.somar()/2;
    }
    public double calcularRaiz1(){
        return Math.sqrt(this.numero1);
    }
    public double calcularRaiz2(){
        return Math.sqrt(this.numero2);
    }
    public double calcularQuadrado1(){
        return Math.pow(this.numero1,2);
    }
    public double calcularQuadrado2(){
        return Math.pow(this.numero2,2);
    }
}