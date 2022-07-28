/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double saldo;
        double tempo;
        
        double valorCredito;
        
        System.out.println("Insira o saldo médio: ");
        saldo=leia.nextDouble();
        System.out.print("\fInsira o tempo de conta em meses: ");
        tempo=leia.nextDouble();
        
        if(tempo<=24){
            if(saldo<=200){
                valorCredito=saldo*0;
            }else if(saldo>=201 && saldo<=400){
                valorCredito=saldo*0.2;
            }else if(saldo>=401 && saldo<=600){
                valorCredito=saldo*0.3;
            }else{
                valorCredito=saldo*0.4;
            }
        }else{
            if(saldo<=200){
                valorCredito=saldo*0.1;
            }else if(saldo>=201 && saldo<=400){
                valorCredito=saldo*0.25;
            }else if(saldo>=401 && saldo<=600){
                valorCredito=saldo*0.35;
            }else{
                valorCredito=saldo*0.45;
            }
        }
        
        System.out.println("\fO valor de crédito do cliente é "+valorCredito);
    }
}