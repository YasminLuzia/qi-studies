/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (13/11/2019 - Prova)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valor;
        double quantidade;
        
        double valorTotal;
        double valorComDesconto;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o valor do produto: ");
        valor=leia.nextDouble();
        System.out.println("\fDigite a quantidade do produto: ");
        quantidade=leia.nextDouble();
        
        valorTotal=valor*quantidade;
        if(valorTotal<=100){
            valorComDesconto=valorTotal*0.97;
        }else{
            valorComDesconto=valorTotal*0.94;
        }
        
        System.out.println("\fO valor total é R$ "+valorTotal+", com o desconto será R$ "+valorComDesconto+".");
    }
}