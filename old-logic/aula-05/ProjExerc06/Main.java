/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 6.Desenhe um programa que leia o raio de um círculo. Seu programa dever calcular a área e calcular o perímetro do círculo.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double raio;
        double area;
        double perimetro;
        
        System.out.println("Digite o raio do círculo: ");
        raio=leia.nextDouble();
        
        area=Math.PI*Math.pow(raio,2);
        perimetro=2*Math.PI*raio;
        
        System.out.println("A área do circulo é igual a "+area);
        System.out.println("O perimetro do círculo é igual a "+perimetro);
    }
}