import java.util.Scanner;
/**
 *
 * @author Yasmin L
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        //instancia-acessando dados publicos
        Vendedor v1=new Vendedor();
        
        //pede e le
        System.out.println("Digite o nome do vendedor: ");
        v1.setNome(leia.nextLine());
        
        do{
            System.out.println("Digite as vendas de Janeiro: ");
            v1.setVendasJaneiro(leia.nextDouble());
            if(v1.getVendasJaneiro()<0){
                System.out.println("ERRO! Valor de vendas inválidas.");
            }
        }while(v1.getVendasJaneiro()<0);
        do{
            System.out.println("Digite as vendas de Fevereiro: ");
            v1.setVendasFevereiro(leia.nextDouble());
            if(v1.getVendasFevereiro()<0){
                System.out.println("ERRO! Valor de vendas inválidas.");
            }
        }while(v1.getVendasFevereiro()<0);
        do{
            System.out.println("Digite as vendas de Março: ");
            v1.setVendasMarco(leia.nextDouble());
            if(v1.getVendasMarco()<0){
                System.out.println("ERRO! Valor de vendas inválidas.");
            }
        }while(v1.getVendasMarco()<0);
        
        //resultados
        System.out.println("\nRESPOSTA: ");
        System.out.println(v1);//invocar o metodo toString
        System.out.println("Média de vendas: R$"+v1.calcularMedia());
        System.out.println("Comissão: R$"+v1.calcularComissao());
    }
}