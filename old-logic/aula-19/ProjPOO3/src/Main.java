import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Vendedor v1=new Vendedor();
        
        System.out.println("Digite o nome do vendedor: ");
        v1.nome=leia.nextLine();
        
        do{
            System.out.println("Digite o valor de vendas de Janeiro: ");
            v1.vendasJaneiro=leia.nextDouble();
            if(v1.vendasJaneiro<0){
                System.out.println("ERRO! Dado inválido");
            }
        }while(v1.vendasJaneiro<0);
        
        do{
            System.out.println("Digite o valor de vendas de Fevereiro: ");
            v1.vendasFevereiro=leia.nextDouble();
            if(v1.vendasFevereiro<0){
                System.out.println("ERRO! Dado inválido");
            }
        }while(v1.vendasFevereiro<0);
        
        do{
            System.out.println("Digite o valor de vendas de Março: ");
            v1.vendasMarco=leia.nextDouble();
            if(v1.vendasMarco<0){
                System.out.println("ERRO! Dado inválido");
            }
        }while(v1.vendasMarco<0);
        
        
        System.out.println("O vendedor "+v1.nome+" vendeu R$"+v1.calcularMedia()+" e sua categoria é "+v1.verDesempenho());
    }
    
}