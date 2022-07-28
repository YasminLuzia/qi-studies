/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (06/11/19)
 *  Ler dois valores inteiros e mostrar a diferença do maior pelo menor.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        int valor1;
        int valor2;
        int diferenca;
        
        System.out.println("Digite o maior valor: ");
        valor1=leia.nextInt();
        System.out.println("Digite o menor valor: ");
        valor2=leia.nextInt();
        
        if(valor1>valor2){
            diferenca=valor1-valor2;
        }else if(valor1==valor2){
            diferenca=0;
        }else {
            diferenca=valor2-valor1;
        }
        
        System.out.println("\fA diferença entre os dois números é "+diferenca);
    }
}