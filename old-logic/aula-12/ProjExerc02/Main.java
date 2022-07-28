/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (11/11/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double salarioFixo;
        double totalVendas;
        double meta;
        
        double percentualMeta;
        double totalMeta;
        double salarioTotal;
        
        System.out.println("Digite o salário fixo do funcionário: ");
        salarioFixo=leia.nextDouble();
        System.out.println("\fDigite o total de vendas efetuadas: ");
        totalVendas=leia.nextDouble();
        System.out.println("\fDigite a meta: ");
        meta=leia.nextDouble();
        
        percentualMeta=totalVendas*100/meta;
        if(totalVendas<meta){
            totalMeta=totalVendas*0.05;
        }else{
            totalMeta=totalVendas*0.08;
        }
        salarioTotal=totalMeta+salarioFixo;
        
        if(salarioFixo<0 || totalVendas<0 || meta<=0){
            System.out.println("\fERRO!! Valores inválidos.");
        }else{
            System.out.println("\fO percentual da meta atingido é "+percentualMeta+"%.");
            System.out.println("\nQuanto ele recebe em meta: R$"+totalMeta);
            System.out.println("\nO salário total é: R$"+salarioTotal);
        }
    }
}