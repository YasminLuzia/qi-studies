/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/19)
 * Desenvolva um programa que leia a idade e retorne se a pessoa é Maior ou Menor de idade.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int idade;
        String resposta;
        
        System.out.println("Digite a sua idade: ");
        idade=leia.nextInt();
        
        if (idade>=18){
            resposta="Maior de Idade";}
        else{resposta="Menor de Idade";}
        
        System.out.println("\fVoce é "+resposta);
    }
}