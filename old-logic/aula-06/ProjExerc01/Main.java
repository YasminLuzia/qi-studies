/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 * 1.Algoritmo que leia o nome de um produto, seu valor de custo e a quantidade. Seu programa deve calcular o total a pagar, o total com 25% de juros e calcular o total com 9% de desconto.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorCusto;
        double quantidade;
        double totalPagar;
        double totalJuros;
        double totalDesconto;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("Digite o valor de custo do produto: ");
        valorCusto=leia.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade=leia.nextDouble();
        
        totalPagar=valorCusto*quantidade;
        totalJuros=totalPagar*1.25;
        totalDesconto=totalPagar*0.91;
        
        System.out.println("\fO produto "+nome+" tem como");
        System.out.println("Valor total a pagar: "+totalPagar);
        System.out.println("Valor total com juros a pagar: "+totalJuros);
        System.out.println("Valor total a pagar com desconto: "+totalDesconto);
    }
}