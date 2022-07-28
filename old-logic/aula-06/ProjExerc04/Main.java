/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 * 4.Desenvolva um programa que leia o nome de um funcionário, o número de horas que o mesmo trabalha no mês e valor que ele ganha por hora. Seu programa deva calcular: salário bruto, o INSS (8% do salário bruto) e o vale transporte (6% do salário bruto), no final apresente os resultados o salário líquido (salário bruto menos os descontos).
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double horasMes;
        double valorHora;
        double salarioBruto;
        double inss;
        double valeTransporte;
        double salarioLiquido;
        
        System.out.println("Digite o nome do funcionário: ");
        nome=leia.nextLine();
        System.out.println("Digite o número de horas que o funcionário trabalha por mês: ");
        horasMes=leia.nextDouble();
        System.out.println("Digite o que o valor que o funcionário ganha por hora: ");
        valorHora=leia.nextDouble();
        
        salarioBruto=horasMes*valorHora;
        inss=salarioBruto*0.08;
        valeTransporte=salarioBruto*0.06;
        salarioLiquido=salarioBruto-(inss+valeTransporte);
        
        System.out.println("\fO salário bruto do funcionário é "+salarioBruto+",\nO INSS é "+inss+",\nO vale transporte é "+valeTransporte+",\nAssim fica com o salário liquido de "+salarioLiquido);
    }
}