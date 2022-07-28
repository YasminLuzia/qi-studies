/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (12/11/2019)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double valorMarco;
        double valorAbril;
        
        double media;
        String conceito;
        
        System.out.println("Digite o nome do funcionário: ");
        nome=leia.nextLine();
        System.out.println("\fDigite o valor das vendas de março: ");
        valorMarco=leia.nextDouble();
        System.out.println("\fDigite o valor das vendas de abril: ");
        valorAbril=leia.nextDouble();
        
        media=(valorMarco+valorAbril)/2;
        if(media>5000){
            conceito="Conceito 10 - EXCELENTE VENDEDOR";
        }else if(media>3500 && media<=5000){
            conceito="Conceito 9 - MUITO BOM VENDEDOR";
        }else if(media>2000 && media<=3500){
            conceito="Conceito 8 - BOM VENDEDOR";
        }else if(media>1000 && media<=2000){
            conceito="Conceito 7 - VENDEDOR ESFORÇADO";
        }else{
            conceito="Conceito 6 - VENDEDOR DESMOTIVADO";
        }
        
        if(valorMarco<0 || valorAbril<0){
            System.out.println("\fERRO!! Valores inválidos");
        }else{
            System.out.println("\fO desempenho do funcionário é: \n"+conceito);
        }
    }
}