/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (13/11/2019 - Prova)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        
        double media;
        String conceito;
        
        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("\fDigite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("\fDigite a nota 2: ");
        nota2=leia.nextDouble();
        
        media=(nota1+nota2)/2;
        if(media>=9){
            conceito="Conceito A";
        }else if(media>=8 && media<9){
            conceito="Conceito B";
        }else if(media>=6 && media<8){
            conceito="Conceito C";
        }else{
            conceito="Conceito D";
        }
        
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10){
            System.out.println("\fERRO !! Notas inválidas");
        }else{
            System.out.println("\fA média de notas do aluno "+nome+" é de "+media+", assim, possui o "+conceito+".");
        }
    }
}