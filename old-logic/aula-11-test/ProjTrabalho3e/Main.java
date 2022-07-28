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
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        double media;
        String conceito;
        
        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("\fDigite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("\fDigite a nota 2:");
        nota2=leia.nextDouble();
        System.out.println("\fDigite a nota 3: ");
        nota3=leia.nextDouble();
        System.out.println("\fDigite a nota 4: ");
        nota4=leia.nextDouble();
        
        media=(nota1+nota2+nota3+nota4)/4;
        
        if(media>=0 && media<2){
            conceito="Ruim, conceito D";
        }else if(media>=2 && media<5.9){
            conceito="Regular, conceito C";
        }else if(media>=6 && media<9){
            conceito="Bom, conceito B";
        }else{
            conceito="Ótimo, conceito A";
        }
        
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10 || nota3<0 || nota3>10 || nota4<0 || nota4>10){
            System.out.println("\fERRO!! - Dados inválidos.");
        }else{
            System.out.println("\fO resultado do aluno(a) "+nome+" é "+conceito);
        }
    }
}