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
        
        int anoNascimento;
        int anoAtual;
        
        int idade;
        int idadeEmDoisMilVinte;
        
        System.out.println("Digite o seu ano de nascimento: ");
        anoNascimento=leia.nextInt();
        System.out.println("\fDigite o ano atual: ");
        anoAtual=leia.nextInt();
        
        idade=anoAtual-anoNascimento;
        idadeEmDoisMilVinte=2020-anoNascimento;
        
        System.out.println("\fSua idade é "+idade+" e você terá "+idadeEmDoisMilVinte+" anos em 2020.");
        
    }
}