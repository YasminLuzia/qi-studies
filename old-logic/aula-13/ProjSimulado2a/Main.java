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
        
        String nome;
        double valorCusto;
        
        double valorVenda;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o valor de custo do produto: ");
        valorCusto=leia.nextDouble();
        
        valorVenda=valorCusto*1.38;
        
        System.out.println("\fO valor de venda do produto será R$ "+valorVenda);
    }
}
