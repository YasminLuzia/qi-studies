/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (30/10/19)
 * 5.Desenvolva um programa que leia o nome de um aluno, duas notas, o número de faltas do mesmo e o número de aulas que deveria assistir. Seu programa deve calcular a média do aluno e a frequência.
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
        double aulas;
        double media;
        double frequencia;
        
        System.out.println("Digite o nome do aluno(a): ");
        nome=leia.nextLine();
        System.out.println("Digite a nota 1 do aluno: ");
        nota1=leia.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        nota2=leia.nextDouble();
        System.out.println("Digite o número de faltas do aluno(a): ");
        faltas=leia.nextDouble();
        System.out.println("Digite o número total de aulas: ");
        aulas=leia.nextDouble();
        
        media=(nota1+nota2)/2;
        frequencia=(aulas-faltas)*100/aulas;
        
        System.out.println("\fO aluno(a) "+nome+" tem como média "+media+".\nSua frequência é de "+frequencia+"%.");
    }
}