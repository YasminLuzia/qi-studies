/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3=leia.nextDouble();
        
        media=(nota1+nota2+nota3)/3;
        
        System.out.println("A média do aluno(a) "+nome+" é "+media+".");
    }
}