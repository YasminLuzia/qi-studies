/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 4.Desenvolva um algoritmo CONVERSOR, este deve ler número de anos, e deverá converter este ano para meses, converter ano para semana, converter ano para dias. Ex.: 1 ano, 12 meses, 52 semanas, 365 dias.
 */
import java.util.Scanner;
public class Main{
   public static void main(String args[]){
       Scanner leia=new Scanner(System.in);
       System.out.print("\f");
       
       int anos;
       int meses;
       int semanas;
       int dias;
       
       System.out.println("Digite a quantidade de anos: ");
       anos=leia.nextInt();
       
       meses=anos*12;
       semanas=anos*52;
       dias=anos*365;
       
       System.out.println("\nPara "+anos+" ano(s) há "+meses+" meses,"+semanas+" semanas e "+dias+" dias.");
    }
}