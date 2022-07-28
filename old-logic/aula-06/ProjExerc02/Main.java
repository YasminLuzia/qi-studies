/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 * 2. Desenvolva um algoritmo que leia o nome de um produto, seu valor unitário e sua quantidade, seu programa deve calcular o total, o total com 35% de juros e o total com 22% de desconto.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorUnidade;
        double quantidade;
        double total;
        double totalComJuros;
        double totalComDesconto;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("Digite o valor do produto: ");
        valorUnidade=leia.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade=leia.nextDouble();
        
        total=valorUnidade*quantidade;
        totalComJuros=total*1.35;
        totalComDesconto=total*0.78;
        
        System.out.println("\fO produto "+nome+" tem como");
        System.out.println("Valor total a pagar: "+total);
        System.out.println("Valor total com juros a pagar: "+totalComJuros);
        System.out.println("Valor total a pagar com desconto: "+totalComDesconto);
    }
}