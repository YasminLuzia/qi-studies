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
        System.out.print("\f");
        
        String nome;
        double salarioMensal;
        double salarioMinimo;
        
        double quantidadeSalarios;
        
        System.out.println("Digite o nome: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o salário mensal: ");
        salarioMensal=leia.nextDouble();
        System.out.println("\fDigite quanto vale um salário mínimo: ");
        salarioMinimo=leia.nextDouble();
        
        quantidadeSalarios=salarioMensal/salarioMinimo;
        
        System.out.println("\fA quantidade de salários mínimos recebidos é "+quantidadeSalarios);
    }
}