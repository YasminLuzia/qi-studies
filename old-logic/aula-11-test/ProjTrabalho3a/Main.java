/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (07/11/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        double media;
        
        System.out.println("Digite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3=leia.nextDouble();
        System.out.println("Digite a nota 4: ");
        nota4=leia.nextDouble();
        
        media=(nota1+nota2+nota3+nota4)/4;
        
        System.out.println("\fA média aritmética é igual a "+media);
    }
}