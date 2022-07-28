/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (31/10/19 - Feliz Halloween!!!)
 * 1.Faça um algoritmo que receba o salário-base de um funcionário, calcule e mostre o salário a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre o salário base.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double salarioBase;
        double salarioReceber;
        
        System.out.println("Digite o salário base: ");
        salarioBase=leia.nextDouble();
        
        salarioReceber=salarioBase*0.98;
        
        System.out.println("\fO salário a receber do funcionario é "+salarioReceber);
    }
}