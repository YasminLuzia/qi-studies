/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/19)
 * Faça um programa que receba a altura e o sexo de uma Pessoa e calcule e mostre seu
peso ideal, conforme as fórmulas: Homens: (72.7 * altura) – 58; Mulheres: (62.1 *altura) – 44.7;
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double altura;
        int sexo;
        
        double pesoIdeal;
        
        System.out.println("Digite a altura: ");
        altura=leia.nextDouble();
        
        do{
            System.out.println("Digite o sexo (1 para feminino e 2 para masculino): ");
            sexo=leia.nextInt();
            if(sexo<1 || sexo>2){
                System.out.println("ERRO! Digite 1 ou 2");
            }
        }while(sexo<1 || sexo>2);
        
        if(sexo==1){
            pesoIdeal=(62.1*altura)-44.7;
        }else{
            pesoIdeal=(72.7*altura)-58;
        }         
        System.out.println("\fO peso ideal é "+pesoIdeal);
    }
}