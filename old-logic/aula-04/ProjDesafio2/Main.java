
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (28/10/19)
 * Desenvolva um programa que leia a, b e c e calcule a báscara. Onde a=1, b=3 e c=2. (x1=-1,x2=-2)
 */
public class Main{
    public static void main(String args[]){
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        
        a=1;
        b=3;
        c=2;
        
        delta=Math.pow(b,2)-4*a*c;
        x1=(-(b)+Math.sqrt(delta))/(2*a);
        x2=(-(b)-Math.sqrt(delta))/(2*a);
        
        System.out.println("\fX1 é igual a "+x1);
        System.out.println("X2 é igual a "+x2);
    }
}
