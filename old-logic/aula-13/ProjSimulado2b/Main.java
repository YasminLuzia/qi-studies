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
        
        double peso;
        
        double pesoMaisQuinze;
        double pesoMenosVinte;
        
        System.out.println("Digite o seu peso em Kg: ");
        peso=leia.nextDouble();
        
        pesoMaisQuinze=peso*115/100;
        pesoMenosVinte=peso*80/100;
        
        System.out.println("\fSeu peso com 15% a mais é: "+pesoMaisQuinze+"Kg.");
        System.out.println("\nSeu peso com 20% a menos é: "+pesoMenosVinte+"Kg.");
    }
}