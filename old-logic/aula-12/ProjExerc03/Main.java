/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (11/11/2019)
 * Receba uma temperatura em graus Celsius e mostrá-la convertida para Fahrenheit. Fórmula da conversão: F = ( 9 * C + 160) / 5, sendo F = fahrenheit e C a temperatura em Celsius
 */
import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double grausCelsius;
        double grausFahrenheit;
        
        System.out.println("Digite os graus em Celsius: ");
        grausCelsius=leia.nextDouble();
        
        grausFahrenheit=(9*grausCelsius+160)/5;
        
        System.out.println("\fA temperatura em Fahrenheit é "+grausFahrenheit);
    }
}