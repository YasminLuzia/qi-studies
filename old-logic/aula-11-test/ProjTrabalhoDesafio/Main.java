/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (07/11/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double a;
        double b;
        double c;
        
        String resposta;
        
        System.out.println("Digite o valor de a: ");
        a=leia.nextDouble();
        System.out.println("Digite o valor de b: ");
        b=leia.nextDouble();
        System.out.println("Digite o valor de c: ");
        c=leia.nextDouble();
        
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && a!=c || b==c && b!=a){
                resposta="O trinângulo é isósceles.";
            }else if(a!=b && a!=c && b!=c){
                resposta="O triângulo é Escaleno";
            }else{
                resposta="O triângulo é Equilátero";
            }
        }else{
            resposta="Não é um triângulo.";
        }
        
        System.out.println("\f"+resposta);
    }
}