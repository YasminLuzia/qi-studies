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
        
        long anoNascimento;
        long anoAtual;
        
        long anos;
        long meses;
        long dias;
        long semanas;
        long horas;
        long minutos;
        long segundos;
        
        System.out.println("Digite sua data de nascimento: ");
        anoNascimento=leia.nextLong();
        System.out.println("\fDigite o ano atual: ");
        anoAtual=leia.nextLong();
        
        anos=anoAtual-anoNascimento;
        meses=anos*12;
        dias=anos*365;
        semanas=anos*52;
        horas=dias*24;
        minutos=horas*60;
        segundos=minutos*60;
        
        System.out.println("\fVocê tem "+anos+" anos, "+meses+" meses, "+dias+" dias, "+semanas+" semanas, "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos de vida.");
        
    }
}
