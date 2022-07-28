import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Calculadora r1=new Calculadora();
        
        System.out.println("Digite o primeiro valor: ");
        r1.numero1=leia.nextDouble();
        System.out.println("Digite o segundo valor: ");
        r1.numero2=leia.nextDouble();
        
        System.out.println("Respostas:");
        System.out.println("Soma: "+r1.somar());
        System.out.println("Multiplicação: "+r1.multiplicar());
        System.out.println("Média: "+r1.calcularMedia());
    }
    
}
