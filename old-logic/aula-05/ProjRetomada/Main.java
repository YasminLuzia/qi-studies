/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner ler=new Scanner(System.in);
        System.out.print("\f");
        
        int numero1;
        int numero2;
        int resultado1;
        int resultado2;
        int resultado3;
        int resultado4;
        int resultado5;
        
        System.out.println("Digite um número: ");
        numero1=ler.nextInt();
        System.out.println("Digite outro número: ");
        numero2=ler.nextInt();
        
        resultado1=numero1+numero2;
        resultado2=numero1-numero2;
        resultado3=numero1*numero2;
        resultado4=numero1/numero2;
        resultado5=resultado1/2;
        
        System.out.println("\fResultado da soma: "+resultado1);
        System.out.println("Resultado da subtração: "+resultado2);
        System.out.println("Resultado da multiplicação: "+resultado3);
        System.out.println("Resultado da divisão: "+resultado4);
        System.out.println("Resultado da média: "+resultado5);
        
        //System.out.println("\n \nResultados: \nResultado da soma: "+resultado1+"\nResultado da subtração: "+resultado2+"\nResultado da multiplicação: "+resultado3+"\nResultado da divisão: "+resultado4+"\nResultado da média: "+resultado5);
    }
}