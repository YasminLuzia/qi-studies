/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (12/11/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double nota1;
        double nota2;
        double frequencia;
        
        double media;
        String resultado;
        
        System.out.println("Digite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("\fDigite a nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("\fDigite a frequencia: ");
        frequencia=leia.nextDouble();
        
        media=(nota1+nota2)/2;
        if(media>=6 && frequencia>=75){
            resultado="Aprovado";
        }else{
            resultado="Reprovado";
        }
        
        if(nota1<0 || nota1>10 || nota2<0 || nota2>10 || frequencia<0 || frequencia>100){
            System.out.println("\fERRO!! Valor inválido");
        }else{
            System.out.println("\fO resultado do aluno é: ");
            System.out.println("\n"+resultado+"!!");
        }
    }
}