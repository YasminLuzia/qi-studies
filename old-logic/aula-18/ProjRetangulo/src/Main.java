import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        //criamos o objeto - instanciar classe
        Retangulo r1=new Retangulo();
        
        //pede e lê os dados
        System.out.println("Digite a largura:");
        r1.largura=leia.nextDouble();
        System.out.println("Digite a altura: ");
        r1.altura=leia.nextDouble();
        
        //mostra respostas
        System.out.println("\nA area é:"
                + r1.calcularArea());
    }
    
}