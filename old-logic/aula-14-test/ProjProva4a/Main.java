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
        double numeroHoras;
        double valorHora;
        
        double salario;
        
        System.out.println("Digite o nome do funcionário: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o número de horas trabalhadas: ");
        numeroHoras=leia.nextDouble();
        System.out.println("\fDigite o valor da hora: ");
        valorHora=leia.nextDouble();
        
        salario=numeroHoras*valorHora;
        
        System.out.println("\f"+nome+" ganha R$ "+salario+" - pois trabalhou "+numeroHoras+" horas este mês.");
    }
}