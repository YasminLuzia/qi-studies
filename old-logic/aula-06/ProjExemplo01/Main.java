/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nomeProduto;
        double valorCusto;
        double valorComJuros;
        double valorComDesconto;
        
        System.out.println("Digite o nome do produto: ");
        nomeProduto=leia.nextLine();
        System.out.println("Digite o valor de custo: ");
        valorCusto=leia.nextDouble();
        
        valorComJuros=valorCusto*1.10;
        valorComDesconto=valorCusto*0.92;
        
        System.out.println("\fO produto "+nomeProduto+" custa R$ "+valorCusto);
        System.out.println("O mesmo com 10% de juros fica R$ "+valorComJuros);
        System.out.println("O mesmo com 8% de desconto dica R$ "+valorComDesconto);
    }
}