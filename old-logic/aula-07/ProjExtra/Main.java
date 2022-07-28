/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 * Desenvolva um programa que leia nome de um produto, valor de custo, valor de venda e quantidade. 
 * Seu programa deve calcular o total que o comerciante paga em seus produtos, o total que o cliente paga em seus produtos, o lucro que o comerciante tem sobre cada produto, o lucro total que ele tem, e qual o percentual de lucro sobre o total.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorCusto;
        double valorVenda;
        double quantidade;
        
        double totalComerciante;
        double totalCliente;
        double lucroPorProduto;
        double lucroSobreTotal;
        double percentualLucro;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("Digite o valor de custo do produto: ");
        valorCusto=leia.nextDouble();
        System.out.println("Digite o valor de venda do produto: ");
        valorVenda=leia.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        quantidade=leia.nextDouble();
        
        totalComerciante=valorCusto*quantidade;
        totalCliente=valorVenda*quantidade;
        lucroSobreTotal=totalCliente-totalComerciante;
        lucroPorProduto=lucroSobreTotal/quantidade;
        percentualLucro=(lucroSobreTotal*100)/totalComerciante;
        
        System.out.println("\fProduto "+nome+"\n O comerciante pagou no total: "+totalComerciante+"\nO clinte paga no total: "+totalCliente+"\nO lucro do comerciante tem sobre cada produto: "+lucroPorProduto+"\nO lucro total: "+lucroSobreTotal+"\nO percentual de lucro sobre o total: "+percentualLucro+"%.");
    }
}