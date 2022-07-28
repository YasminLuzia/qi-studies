/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/19)
 * Desenvolva um programa que leia um número e diga se ele é "Positivo", "Negativo" ou "Nulo".
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double numero;
        String resposta;
        
        System.out.println("Digite o numero: ");
        numero=leia.nextDouble();
        
        if(numero>0){
            resposta="Positivo";
        } else if(numero<0){
        resposta="Negativo";}
        else{resposta="Nulo";}
        
        System.out.println("\fO numero digitado é "+resposta);
    }
}