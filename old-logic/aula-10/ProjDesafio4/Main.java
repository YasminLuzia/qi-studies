/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 * Faça um programa que receba o salário de um funcionário. Se o salário for menor ou igual a 500, então esse funcionário tem direito a 30% de aumento. Caso contrário, não terá direito a aumento nenhum. Mostrar o valor do aumento.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double salario;
        
        double aumento;
        
        System.out.println("Digite o salário do funcionario: ");
        salario=leia.nextDouble();
        
        if (salario<=500){
            aumento=salario*0.3;
        }else{
            aumento=0;
        }
        
        System.out.println("\fO salário do funcionario aumentou R$"+aumento);
    }
}