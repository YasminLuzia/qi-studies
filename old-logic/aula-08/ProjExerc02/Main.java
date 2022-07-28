/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/2019)
 * Desenvolva um programa que leia um número inteiro e diga se o mesmo é "Par" ou "Ímpar".
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double numero;
        String resposta;
        
        System.out.println("Digite o numero a ser dividido: ");
        numero=leia.nextDouble();
        
        
        if(numero%2==0){
            resposta="Par";}
        else{resposta="Impar";}
        
        System.out.println("O numero inserido é: "+resposta);
    }
}