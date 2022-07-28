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
        
        String nome;
        double peso;
        double altura;
        
        double imc;
        String resposta;
        
        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();
        System.out.println("\fDigite seu peso em kg: ");
        peso=leia.nextDouble();
        System.out.println("\fDigite sua altura: ");
        altura=leia.nextDouble();
        
        imc=peso/Math.pow(altura,2);
        if(imc>=18.5 && imc<=24.9){
            resposta="Parabéns, você está no peso ideal!";
        }else{
            resposta="Lamento, você não está no peso ideal.";
        }
        
        System.out.println(resposta);
    }
}