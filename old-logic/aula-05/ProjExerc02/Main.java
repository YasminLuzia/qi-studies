/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 2.Desenvolva um programa que leia um valor em dólar e a cotação atual do dólar. Seu programa deve mostrar a conversão para Reais.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double valorDolar;
        double dolarAtual;
        double valorReais;
        
        System.out.println("Digite a quantidade de dólar para a conversão: ");
        valorDolar=leia.nextDouble();
        System.out.println("Digite o valor do dólar atualmente: ");
        dolarAtual=leia.nextDouble();
        
        valorReais=valorDolar*dolarAtual;
        
        System.out.println("Seu valor de dólar em reais é R$"+valorReais);
    }
}