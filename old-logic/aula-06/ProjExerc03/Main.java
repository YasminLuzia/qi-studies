/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/2019)
 * 3.Desenvolva um programa que leia um valor para x e um valor para y. Seu programa deve retornar dois resultados, seguindo os cálculos:((2+y+raiz de x)/(2x))+(x²/raiz de y) e (y na x+raiz de x)/(2xy)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double x;
        double y;
        double resultado1;
        double resultado2;
        
        System.out.println("Digite o valor de x: ");
        x=leia.nextDouble();
        System.out.println("Digite o valor de y: ");
        y=leia.nextDouble();
        
        resultado1=((2+y+Math.sqrt(x))/(2*x))+(Math.pow(x,2)/Math.sqrt(y));
        resultado2=(Math.pow(y,x)+Math.sqrt(x))/(2*x*y);
        
        System.out.println("\fO resultado da primeira conta é "+resultado1);
        System.out.println("O resultado da segunda conta é "+resultado2);
    }
}