import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Pessoa p1=new Pessoa();
        
        System.out.println("Digite seu nome: ");
        p1.nome=leia.nextLine();
        
        do{
            System.out.println("Digite seu peso: ");
            p1.peso=leia.nextDouble();
            if(p1.peso<=0){
                System.out.println("ERRO! Dados Inválidos");
            }
        }while(p1.peso<=0);
        
        do{
            System.out.println("Digite sua altura: ");
            p1.altura=leia.nextDouble();
            if(p1.altura<=0){
                System.out.println("ERRO! Dados Inválidos");
            }
        }while(p1.altura<=0);
        
        System.out.println("Seu IMC é "+p1.calcularIMC()+" e você está "+p1.verPeso());
    }
    
}