/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 * Desenvolva um programa que leia a quantidade de compras de latas de refri, de garrafa de 600 e garrafa de 2 litros. Seu programa deve calcular a quantidade de litros comprados e o valor total a pagar, sendo: Lata - 250ml - 2,50/ Garrafa - 600ml - 4,00/ Garrafa - 2L - 6,80.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int quantidadeLatas;
        int quantidadeGarrafa1;
        int quantidadeGarrafa2;
        double litrosComprados;
        double totalPagar;
        
        System.out.println("Insira a quantidade de lata(s) 250mL: ");
        quantidadeLatas=leia.nextInt();
        System.out.println("Insira a quantidade de garrafa(s) de 600mL: ");
        quantidadeGarrafa1=leia.nextInt();
        System.out.println("Insira a quantidade de garrafa(s) de 2L: ");
        quantidadeGarrafa2=leia.nextInt();
        
        litrosComprados=(quantidadeLatas*0.25)+(quantidadeGarrafa1*0.6)+(quantidadeGarrafa2*2);
        totalPagar=(quantidadeLatas*2.5)+(quantidadeGarrafa1*4)+(quantidadeGarrafa2*6.8);
        
        System.out.println("\fA quantidade de litros comprados é "+litrosComprados+".\nO valor total a pagar é "+totalPagar);
        
    }
}
