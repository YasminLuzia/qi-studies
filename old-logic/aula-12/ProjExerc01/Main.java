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
        
        double valorVendas;
        double meta;
        
        double comissao;
        
        System.out.println("Digite o valor das vendas do funcionário: ");
        valorVendas=leia.nextDouble();
        System.out.println("\fDigite a meta que o funcionário deve atingir: ");
        meta=leia.nextDouble();
        
        if (valorVendas<(meta*0.5)){
            comissao=valorVendas*0.01;
        }else if(valorVendas>=(meta*0.5)&&valorVendas<=(meta*0.75)){
            comissao=valorVendas*0.025;
        }else if(valorVendas>(meta*0.75)&&valorVendas<=meta){
            comissao=valorVendas*0.035;
        }else{
            comissao=valorVendas*0.05;
        }
        
        if(valorVendas<0 || meta<=0){
            System.out.println("ERRO!! Valores inválidos.");
        }else{
            System.out.println("\fA comissão do funcionário será "+comissao);
        }
    }
}