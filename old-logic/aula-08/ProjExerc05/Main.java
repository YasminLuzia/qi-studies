/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/19)
 * Desenvolva um programa que leia um número inteiro e diga qual mês equivale o número digitado.
Exemplo:1 - Janeiro
	2 - Fevereiro
	...
	12 - Dezembro
	Qualquer outro número - Inválido
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int numeroMes;
        String nome;
        
        System.out.println("Digite o numero: ");
        numeroMes=leia.nextInt();
        
        if(numeroMes==1){
            nome="Janeiro";
        }else if(numeroMes==2){
            nome="Fevereiro";
        }else if(numeroMes==3){
            nome="Março";
        }else if(numeroMes==4){
            nome="Abril";
        }else if(numeroMes==5){
            nome="Maio";
        }else if(numeroMes==6){
            nome="Junho";
        }else if(numeroMes==7){
            nome="Julho";
        }else if(numeroMes==8){
            nome="Agosto";
        }else if(numeroMes==9){
            nome="Setembro";
        }else if(numeroMes==10){
            nome="Outubro";
        }else if(numeroMes==11){
            nome="Novembro";
        }else if(numeroMes==12){
            nome="Dezembro";
        }else{
            nome="Inválido";
        }
        
        System.out.println("\fO mês "+numeroMes+" é "+nome+".");
    }
}