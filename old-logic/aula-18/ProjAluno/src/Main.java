import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        //instanciar classe
        Aluno a1=new Aluno();
        
        //pede e le
        System.out.println("Digite o nome do aluno:");
        a1.nome=leia.nextLine();
        System.out.println("Digite a nota 1:");
        a1.nota1=leia.nextDouble();
        System.out.println("Digite a nota 2:");
        a1.nota2=leia.nextDouble();
        
        //respostas
        System.out.println("\nRESPOSTAS:");
        System.out.println("Média: "+a1.calcularMedia());
        System.out.println("Resultado: "+a1.verResultado());
    }
    
}
