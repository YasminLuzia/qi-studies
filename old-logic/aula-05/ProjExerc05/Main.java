/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 5.Desenvolva um programa que leia a altura e base de um retângulo. Seu programa deve calcular a área do retângulo.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double base;
        double altura;
        double area;
        
        System.out.println("Insira a medida da base do retângulo (em centimetros): ");
        base=leia.nextDouble();
        System.out.println("Insira a medida da altura do retângulo (em centimetros): ");
        altura=leia.nextDouble();
        
        area=base*altura;
        
        System.out.println("A área do retângulo é de "+area+" CM².");
    }
}