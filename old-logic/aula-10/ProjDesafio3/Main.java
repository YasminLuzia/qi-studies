/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 * Faça um programa que calcule a báscara, porém teste se é possível calculá-la com os valores informados. Ex: não pode haver divisão por zero, e também não pode haver raiz de número negativo.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double a;
        double b;
        double c;
        
        double delta;
        double x1;
        double x2;
        
        System.out.println("Digite o valor de a: ");
        a=leia.nextDouble();
        System.out.println("Digite o valor de b: ");
        b=leia.nextDouble();
        System.out.println("Digite o valor de c: ");
        c=leia.nextDouble();
        
        delta=Math.pow(b,2)-4*a*c;
        x1=-b+Math.sqrt(delta)/2*a;
        x2=-b-Math.sqrt(delta)/2*a;
        
        
        if (a==0 || delta<0){
            System.out.println("\fNão possível calcular a bhaskara.");
        }else{
            System.out.println("\fA primeira resposta da bhaskara é "+x1+" e a segunda é "+x2);
        }
        
    }
}