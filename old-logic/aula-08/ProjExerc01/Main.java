/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (04/11/2019)
 * Desenvolva um programa que leia nome e três notas de um aluno.
Seu programa deve calcular a média do aluno e retornar se o mesmo foi aprovado ou reprovado. OBS.: Para aprovar a média do aluno precisa ser 6 ou mais.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        String nome;
        double nota1;
        double nota2;
        double nota3;
        
        double media;
        String resposta;
        
        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1=leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2=leia.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3=leia.nextDouble();
        
        media=(nota1+nota2+nota3)/3;
        if (media>=6){
            resposta="Aprovado";}
        else{
            resposta="Reprovado";}
        
        System.out.println("O aluno está "+resposta+" com média "+media);
    }
}