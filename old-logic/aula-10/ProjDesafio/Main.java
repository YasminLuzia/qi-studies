/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        double faltas;
        double numeroAulas;
        
        double media;
        double frequencia;
        String resultado;
        
        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("Digite as faltas: ");
        faltas=leia.nextDouble();
        System.out.println("Digite o número de aulas: ");
        numeroAulas=leia.nextDouble();
        
        media=(nota1+nota2)/2;
        frequencia=(numeroAulas-faltas)*100/numeroAulas;
        if (media<2){
            resultado="Reprovado";
        }else if((media>=2 && media<=5.9) && frequencia<75){
            resultado="Reprovado por faltas";
        }else if((media>=2 && media<=5.9) && frequencia>=75){
            resultado="Recuperação";
        }else if(media>=6 && frequencia<75){
            resultado="Reprovado por falta";
        }else if(media>=8 && frequencia>=80){
            resultado="Aprovado com Láurea";
        }else {
            resultado="Aprovado";
        }
        
        System.out.println("O aluno "+nome+" foi "+resultado);
    }
}