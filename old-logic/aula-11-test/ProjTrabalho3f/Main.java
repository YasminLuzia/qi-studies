/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (07/11/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.println("\f");
        
        String nome;
        double valor;
        double quantidade;
        
        double valorPagar;
        double valorComDesconto;
        
        System.out.println("Digite o nome do produto: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o valor do produto: ");
        valor=leia.nextDouble();
        System.out.println("\fDigite a quantidade: ");
        quantidade=leia.nextDouble();
        
        valorPagar=valor*quantidade;
        if(valorPagar<=100){
            valorComDesconto=valorPagar*0.99;
        }else if(valorPagar>100 && valorPagar<=300){
            valorComDesconto=valorPagar*0.975;
        }else if(valorPagar>300 && valorPagar<=500){
            valorComDesconto=valorPagar*0.95;
        }else{
            valorComDesconto=valorPagar*0.92;
        }
        
        System.out.println("\fO valor total a pagar é R$ "+valorPagar+".\nCom desconto seu valor final é R$ "+valorComDesconto+".");
    }
}