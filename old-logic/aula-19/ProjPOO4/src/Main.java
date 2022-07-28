import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Compra c1=new Compra();
        
        do{
            System.out.println("Digite a quantidade de refris lata de 250mL a comprar: ");
            c1.refriLata=leia.nextInt();
            if(c1.refriLata<0){
                System.out.println("ERRO! Dados inválidos");
            }
        }while(c1.refriLata<0);
        
        do{
            System.out.println("Digite a quantidade de refris de 600mL a comprar: ");
            c1.refri600=leia.nextInt();
            if(c1.refri600<0){
                System.out.println("ERRO! Dados inválidos");
            }
        }while(c1.refri600<0);
        
        do{
            System.out.println("Digite a quantidade de refris de 2L a comprar: ");
            c1.refri2L=leia.nextInt();
            if(c1.refri2L<0){
                System.out.println("ERRO! Dados inválidos");
            }
        }while(c1.refri2L<0);
        
        System.out.println("Os litros comprados são "+c1.calcularLitros()+" e o total a pagar é R$"+c1.calcularTotal());
    }
    
}
