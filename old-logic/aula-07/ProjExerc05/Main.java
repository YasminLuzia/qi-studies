/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 *5.Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário final do funcionário.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double salarioFixo;
        double valorVendas;
        double comissao;
        double salarioFinal;
        
        System.out.println("Digite o salário fixo: ");
        salarioFixo=leia.nextDouble();
        System.out.println("Digite o valor das vendas: ");
        valorVendas=leia.nextDouble();
        
        comissao=valorVendas*0.04;
        salarioFinal=salarioFixo+comissao;
        
        System.out.println("\fA comissão do funcionário é igual a R$"+comissao+" e seu salário final é R$"+salarioFinal);
    }
}