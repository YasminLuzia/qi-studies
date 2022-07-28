public class Compra {
    //atributos
    public int refriLata;
    public int refri600;
    public int refri2L;
    
    //metodos
    public double calcularLitros(){
        return this.refriLata*0.25+this.refri600*0.6+this.refri2L*2;
    }
    public double calcularTotal(){
        return this.refriLata*3.5+this.refri600*4.1+this.refri2L*5.8;
    }
    
}