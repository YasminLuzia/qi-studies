/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 * 6.Escreva um programa que leia um valor em dinheiro, e diga em quantas notas de 100, 50, 
10, 5 e 1 ele pode ser decomposto, em seguida mostrar o resultado.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int dinheiro;
        int notas100;
        int notas50;
        int notas20;
        int notas10;
        int notas5;
        
        System.out.println("Digite a quantidade em dinheiro: ");
        dinheiro=leia.nextInt();
        
        notas100=dinheiro/100;
        notas50=dinheiro%100/50;
        notas20=dinheiro%50/20;
        notas10=dinheiro%50%20/10;
        notas5=dinheiro%10/5;
        
        System.out.println(notas100+" notas de cem,"+notas50+" notas de 50,"+notas20+" notas de 20, "+notas10+" notas de 10 e "+notas5+" notas de 5.");
    }
}