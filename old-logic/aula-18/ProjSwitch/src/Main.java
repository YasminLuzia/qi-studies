import java.util.Scanner;
/**
 *
 * @author Luzia
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        //variaveis
        byte codigo;
        int quantidade;
        
        String produto;
        double totalPagar;
        double totalDesconto;
        byte continua; //variavel continua
        
        do{ //faça
        System.out.print("\nDigite o codigo do produto: "
                + "\n1- Pão de queijo"
                + "\n2- Sonho"
                + "\n3- Folhado"
                + "\n4- Risoles"
                + "\n5- Refri"
                + "\n=>" );
        codigo=leia.nextByte();
        System.out.println("Digite a quantidade:");
        quantidade=leia.nextInt();
        
        //calculos
        switch(codigo){
            case 1:
                totalPagar=quantidade*1;
                produto="Pão De Queijo";
                break;
            case 2:
                totalPagar=quantidade*1.99;
                produto="Sonho";
                break;
            case 3:
                totalPagar=quantidade*3.5;
                produto="Folhado";
                break;
            case 4:
                totalPagar=quantidade*4;
                produto="Risoles";
                break;
            default:
                totalPagar=quantidade*3.2;
                produto="Refri";
        }
        
        if(quantidade<10){
            totalDesconto=totalPagar*0.985;
        }else{
            totalDesconto=totalPagar*0.968;
        }
        
        //respostas
        System.out.println("\nRESPOSTAS:");
        if(codigo<1 || codigo>5 || quantidade<=0){
            System.out.println("ERROO! Dados invalidos");
        }else{
            System.out.println("Código: "+codigo+" - "+produto);
            System.out.println("Quantidade: "+quantidade);
            System.out.println("Valor Total: "+totalPagar);
            System.out.println("Valor com desconto: "+totalDesconto);
        }
            System.out.println("Deseja continuar??"
                    + "\n1- Sim"
                    + "\n2- Não");
            continua=leia.nextByte();
        }while(continua!=2);
        
    }
    
}